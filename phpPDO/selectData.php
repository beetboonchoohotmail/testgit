<?php
    include '../phpPDO/PDOConnect.php';
    $stmt = $pdo->prepare("SELECT * FROM users WHERE email = :email AND status = :status");
    $stmt->execute(['email' => $email, 'status' => $status]);
    $user = $stmt->fetch(); // ดึงข้อมูลหนึ่งแถว
    $allUsers = $stmt->fetchAll(); // ดึงข้อมูลทั้งหมด