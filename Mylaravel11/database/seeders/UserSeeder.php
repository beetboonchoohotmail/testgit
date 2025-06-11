<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

use Illuminate\Support\Facades\Hash as FacadesHash;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
            /*$user = new \App\Models\User();
            $user->name = "Admin Laravel 9";
            $user->email = "laravel@gmail.com";
            $user->password = FacadesHash::make('password');
            $user->save();

            $user = new \App\Models\User();
            $user->name = "Admin Yii";
            $user->email = "Yii@gmail.com";
            $user->password = FacadesHash::make('password');
            $user->save();

            $this->call(
                [
                    UserSeeder::class,
                ]);*/

                \App\Models\User::factory()->count(20)->create();
    }
}
