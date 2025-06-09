<!DOCTYPE html>
    <html>
        <head>
            <title>App Name - @yield('title')</title>
            <link rel="stylesheet" href="{{ asset('dist-front/css/bootstrap.min.css') }}">
            @yield('css_before')
        </head>
        <body>
            <div class="container">
                @yield('content')
            </div>
        </body>
        <script src="{{ asset('dist-front/js/jquery-3.6.0.min.js') }}"></script>
            @yield('js_before')
    </html>