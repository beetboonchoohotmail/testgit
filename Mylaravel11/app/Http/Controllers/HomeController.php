<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function index(){
         return "HomeController";
    }
    public function create(){
         return "create";
    }
    public function update($id=null){
         return "update".$id;
    }
    public function store(){
         return "store";
    }
}
