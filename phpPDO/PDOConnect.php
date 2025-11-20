<?php 
 //Connect database
 $user = 'root';
 $pass = '';
$charset = 'utf8mb4';

// Data Source Name (DSN)
$dsn = "mysql:host=$host;dbname=$db;charset=$charset";
$options = [
    // กำหนดให้ PDO ใช้ Exceptions ในการแจ้งเตือนข้อผิดพลาด
    PDO::ATTR_ERRMODE => false,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
];

try {
    // สร้าง Object การเชื่อมต่อ PDO
    $pdo = new PDO($dsn, $user, $pass, $options);
    echo "เชื่อมต่อฐานข้อมูลสำเร็จ!";
} catch(\PDOException $e){
    // จัดการข้อผิดพลาดในการเชื่อมต่อ
     throw new \PDOException($e->getMessage(), (int)$e->getCode());
}