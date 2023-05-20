package com.wangdefa.permission_controll.framework.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

public class JwtUtil {

    // time to live
    public static final Long DEFAULT_TTL = 60 * 60 * 1000L;// 60 * 60 * 1000  1 hour
    // key plaintext
    public static final String PLAINTEXT_KEY = "wangdefa4587";

    // test purpose
    public static void main(String[] args) throws Exception {
        String jwt = createJWT("{a:'111',b:'222'}");
        System.out.println(jwt);

        Claims claims = JwtUtil.parseJWT(jwt);
        System.out.println(claims.size());
        for (Map.Entry<String, Object> e : claims.entrySet()) {
            System.out.println(e.getKey() + " --- " + e.getValue());
        }

        Claims claims1 = JwtUtil.parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1OWE3ZWVjYTc2MDM0ZDJlOWUwMTQ3Y2Y2OTEwM2U0MCIsInN1YiI6IjEyMzQ1NiIsImlzcyI6IndhbmdkZWZhIiwiaWF0IjoxNjg0NTgzNjMxLCJleHAiOjE2ODQ1ODcyMzF9.0wwEYzdtKKfu2yOeAOeQrrU64u2rtkMUtFnt7c0sAeA");
        Claims claims2 = JwtUtil.parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiMDQyZTdiMjg0ZWI0YWYwYTNiZjA4Y2I3NjAzZThjNSIsInN1YiI6IjEyMzQ1NiIsImlzcyI6IndhbmdkZWZhIiwiaWF0IjoxNjg0NTgzNjYxLCJleHAiOjE2ODQ1ODcyNjF9.KhD22_SQwS3CDxEGsjMAWSPcSGNjKwdPKZVwzvHD3Fw");
        System.out.println(claims1.getSubject());
        System.out.println(claims2.getSubject());
    }

    public static SecretKey generalKey() {
        byte[] encodedKey = Base64.getDecoder().decode(JwtUtil.PLAINTEXT_KEY);
        return new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
    }

    public static String createJWT(String subject) {
        return createJWT(subject, null);
    }

    public static String createJWT(String subject, Long ttlMillis) {
        return createJWT(IdUtil.getUUID(), subject, ttlMillis);
    }

    public static String createJWT(String id, String subject, Long ttlMillis) {
        JwtBuilder builder = getJwtBuilder(id, subject, ttlMillis);
        return builder.compact();
    }

    private static JwtBuilder getJwtBuilder(String uuid, String subject, Long ttlMillis) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        SecretKey secretKey = generalKey();
        if (ttlMillis == null) {
            ttlMillis = JwtUtil.DEFAULT_TTL;
        }
        Date now = new Date();
        Date expDate = new Date(now.getTime() + ttlMillis);
        return Jwts.builder()
                .setId(uuid)
                .setSubject(subject)   // json data
                .setIssuer("wangdefa")
                .setIssuedAt(now)
                .signWith(signatureAlgorithm, secretKey)
                .setExpiration(expDate);
    }


    public static Claims parseJWT(String jwt) throws Exception {
        SecretKey secretKey = generalKey();
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(jwt)
                .getBody();
    }


}
