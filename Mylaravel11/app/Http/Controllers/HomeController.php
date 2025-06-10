<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function index(){
         return view('home');
    }
    public function create(){
         return view('aboute');
    }
    public function update($id=null){
         return "update".$id;
    }
    public function store(){
         return "store";
    }
}
