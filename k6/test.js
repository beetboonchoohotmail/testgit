import http from 'k6/http';
import { sleep, check } from 'k6';

export let options = {
    vus: 5,         // จำนวนผู้ใช้จำลอง
    duration: '10s' // ระยะเวลารันสคริปต์
};

export default function () {
    let res = http.get('https://example.com'); // ใส่ URL ที่ต้องการทดสอบ
    check(res, {
        'status is 200': (r) => r.status === 200,
        'body is not empty': (r) => r.body.length > 0,
    });
    sleep(1); // พัก 1 วินาทีระหว่างคำขอ
}