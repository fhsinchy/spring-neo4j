CREATE 
(john:User{name:"John W", username: "john", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(jack:User{name:"Jack S", username: "jack", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(kamala:User{name:"Kamala K", username: "kamala", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(ali:User{name:"Muhammad Ali", username: "ali", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(israt:User{name:"Israt S", username: "israt", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(fahim:User{name:"Fahim A", username: "fahim", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(mikail:User{name:"Mirza Mikail", username: "mikail", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(price:User{name:"John Price", username: "price", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(mcmillan:User{name:"MacMillan", username: "mcmillan", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),
(simon:User{name:"Simon Riley", username: "riley", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_USER"}),


(blazor:Course{title: "Blazor Shopping Cart Application", teacher: "Gavin Lon", identifier: "PL4LFuHwItvKbdK-ogNsOx2X58hHGeQm8c"}),
(blazor_lesson_1:Lesson{title: "Blazor (WebAssembly) and Web API on .NET 6 (C#) - Let’s Build a Shopping Cart Application - Part 1", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (blazor),
(blazor_lesson_2:Lesson{title: "Blazor (WebAssembly) and Web API on .NET 6 (C#) - Let’s Build a Shopping Cart Application - Part 2", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (blazor),
(blazor_lesson_3:Lesson{title: "Blazor (WebAssembly) and Web API on .NET 6 (C#) - Let’s Build a Shopping Cart Application - Part 3", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (blazor),
(blazor_lesson_4:Lesson{title: "Blazor (WebAssembly) and Web API on .NET 6 (C#) - Let’s Build a Shopping Cart Application - Part 4", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (blazor),

(asp:Course{title: "ASP .NET Core MVC Web Application (.NET 5)", teacher: "Gavin Lon", identifier: "PL4LFuHwItvKZ6Mz5W5wzD9uo3w6tNChhX"}),
(asp_lesson_1:Lesson{title: "Part 1 - Overview - Let's Build an ASP.NET Core MVC Web Application on .NET 5", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (asp),
(asp_lesson_2:Lesson{title: "Part 2 - Getting Started - Let's Build an ASP.NET Core MVC Web Application on .NET 5", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (asp),
(asp_lesson_3:Lesson{title: "Part 3 - Database Design - Let's Build an Asp.NET Core MVC Web Application on .NET 5", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (asp),
(asp_lesson_4:Lesson{title: "Part 4 - Project Infrastructure & Identity-Let's Build an Asp.NET Core MVC Web Application on .NET 5", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (asp),

(csharp:Course{title: "Advanced C#", teacher: "Gavin Lon", identifier: "PL4LFuHwItvKaOi-bN1E2WUVyZbuRhVokL"}),
(csharp_lesson_1:Lesson{title: "Introduction - Advanced C# Tutorial (Part 1)", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (csharp),
(csharp_lesson_2:Lesson{title: ".NET 5 (.NET Framework, Mono and .NET Core) - Advanced C# Tutorial (Part 2)", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (csharp),
(csharp_lesson_3:Lesson{title: "C# Delegates (Part 1 - Introduction) - Advanced C# Tutorial (Part 3.1)", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (csharp),
(csharp_lesson_4:Lesson{title: "C# Delegates (Part 2 - Practical Code Example) - Advanced C# Tutorial (Part 3.2)", identifier: "T9-FULwMIkU"})-[:BELONGS_TO]-> (csharp),

(unity:Course{title: "Unity for Beginners (C#) 2023", teacher: "Gavin Lon", identifier: "PL4LFuHwItvKYl6zPFGm9I9ejmR3uX8izX"}),
(unity_lesson_1:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Introduction", identifier: "KTk-UFBnQpM"})-[:BELONGS_TO]-> (unity),
(unity_lesson_2:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Part 2 - Getting Started", identifier: "ocgsl2A5rsg"})-[:BELONGS_TO]-> (unity),
(unity_lesson_3:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Part 3 - Control Player Movement (C# Script)", identifier: "O3tXeChXXJA"})-[:BELONGS_TO]-> (unity),
(unity_lesson_4:Lesson{title: "Unity for Beginners (C#) - 2023 - Game - Part 4 - Camera Follow Player, and Player Jump", identifier: "1z8nRzfdEgU"})-[:BELONGS_TO]-> (unity),


(john)-[:ENROLLED_IN]-> (blazor),
(jack)-[:ENROLLED_IN]-> (blazor),
(kamala)-[:ENROLLED_IN]-> (blazor),
(ali)-[:ENROLLED_IN]-> (blazor),

(israt)-[:ENROLLED_IN]-> (asp),
(fahim)-[:ENROLLED_IN]-> (asp),

(mikail)-[:ENROLLED_IN]-> (unity),
(mcmillan)-[:ENROLLED_IN]-> (unity),

(simon)-[:ENROLLED_IN]-> (csharp);
