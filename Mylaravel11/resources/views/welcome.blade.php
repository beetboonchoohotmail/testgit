<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Laravel 11</title>
    </head>
    <body>
        <div>
            <a href={{route('profiless')}}>Click Profile</a> <br />
            <a href="{{route('viewParam', ['id' => 2554, 'name' => 'suttawat'])}}">Click Par View</a> <br /><br />

            <form method="POST" action="/store">
                @csrf
                <input type="text" name="/topic" /> <br />
                <input type="text" name="/detail" /> <br />
                <hr /><br />
                <button type="submit">บันทึกข้อมูล</button>
            </form>
        </div>
    </body>
</html>