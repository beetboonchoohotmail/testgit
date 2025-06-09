<?php

use Illuminate\Support\Facades\Route;
use Illuminate\Http\Request;

// import Controller Home
use App\Http\Controllers\HomeController;
//import PostController
use App\Http\Controllers\PostsController;

//Auth::routes();

//Home Controller
Route::get('/home',[HomeController::class,'index'])->name('index');
Route::get('/create',[HomeController::class,'create'])->name('create');
Route::get('/update/{id?}',[HomeController::class,'update'])->name('update');
Route::get('/store',[HomeController::class,'store'])->name('store');

//Posts
Route::resource('posts', PostsController::class);

//Connect to View
Route::get('/aboute',function(){
    return view('aboute');
});

Route::get('/postss',[PostsController::class,'index']);

Route::get('/', function () {
    return view();
});

Route::get('/category',function(){
    return "category";
});

Route::get('/posts',function(){
    return "posts";
});

Route::get('/news-detail',function(){
    return "news-detail";
});

//เพิ่ม Parameter
Route::get('userid/{id}',function($id){
    return "This is Param => ".$id;
});

Route::get('userpar/{id?}',function($id=null){
    return "This is Param สามารถ null ได้ : ".$id;
});

//กำหนดค่าเริ่มต้น
Route::get('/profile/{name?}',function($name = 'Suttawat Boonchoo'){
    return "Hello: ".$name;
});

//กำหนดให้หลาย Param
Route::get('/users/{id}/{name}', function($id,$name) {
    return "This is id: ".$id." Name: ".$name;
});

//Regular Expression Route เพิ่มเงื่อนไขพิเศษ หรือว่า Where
// ใส่ เงื่อนไข 0-9
Route::get('/number/{id}',function($id){
    return "รับค่า ID เป็นตัวเลข 0 - 9 เท่านั้น: ".$id;
})->where('id','[0-9]+');

//รับค่าเป็นตัวหนังสืออย่างเดียว A-z a-z
Route::get('/A_Z/{name}', function($name) {
    return "รับค่า Name เป็นตัวอักษร A - Z a - z ได้ทั้งตัวพิมพ์ เล็ก พิมพ์ใหมญ่: ".$name;
});

//ได้ทั้งตัวเลขตัวอังกฤษ
Route::get('/parAll/{id}/{name}',function($id,$name){
    return "ID: ".$id." Name: ".$name;
})->where(['id'=>'[0-9]+','name'=>'[A-Za-z]+']);

//Named Routes With Parameters
Route::get('/user/profile', function(){
    return "ExRouter User/Profile";
})->name('profiless');

//Named Routes With Parameters
Route::get('/viewParam/{id}/{name}', function($id = null, $name = null){
    return "ID: ".$id." <br /> User Name: ".$name;
})->name('viewParam');

//สร้าง Route Group
Route::prefix('admin')->group(function () {
    Route::get('/dashborad',function(){
        return "dashborad";
    });
    Route::get('/backend',function(){
        return "backend";
    });
    Route::get('/api',function(){
        return "api";
    });
});

Route::post('/store', function(Request $request) {
    dd($request->all());
});

Route::get('/admin',function(){
    return "Admin";
})->middleware('admin')->name('admin');

Route::get('/admin_login', function(){
    return "Admin Login";
})->name('admin_login');

