<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Post;

class PostsController extends Controller
{
  
    public function index()
    { 
        //การส่งค่าจาก Con ไป View
        $post = Post::with('SubCategory')->orderBy('id','desc')->where('language_id','th')->get();
      
        return view('post.index',compact('PostName','CountPost'));
    }


    public function create()
    {
        //
    }

    public function store(Request $request)
    {
        //
    }

    public function show(string $id)
    {
        //
    }

    public function edit(string $id)
    {
        //
    }

    public function update(Request $request, string $id)
    {
        //
    }

    public function destroy(string $id)
    {
        //
    }
}
