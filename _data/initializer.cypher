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


(farhan:User{name: "Farhan Hasin Chowdhury", username: "farhan", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_TEACHER"}),
(gavin:User{name: "Gavin Lon", username: "gavin", password: "$2a$12$OKAuHjzrhMge/hB5FPKJTeygdFlQgOWLPA.BnI.3uTCQfA9nITGWC", roles: "ROLE_TEACHER"}),


(blazor:Course{title: "Blazor Shopping Cart Application", identifier: "PL4LFuHwItvKbdK-ogNsOx2X58hHGeQm8c"}),
(asp:Course{title: "ASP .NET Core MVC Web Application (.NET 5)", identifier: "PL4LFuHwItvKZ6Mz5W5wzD9uo3w6tNChhX"}),
(csharp:Course{title: "Advanced C#", identifier: "PL4LFuHwItvKaOi-bN1E2WUVyZbuRhVokL"}),


(unity:Course{title: "Unity for Beginners (C#) 2023", identifier: "PL4LFuHwItvKYl6zPFGm9I9ejmR3uX8izX"}),
(unityl1:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Introduction", identifier: "KTk-UFBnQpM"})-[:BELONGS_TO]-> (unity),
(unityl2:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Part 2 - Getting Started", identifier: "ocgsl2A5rsg"})-[:BELONGS_TO]-> (unity),
(unityl3:Lesson{title: "Unity for Beginners (C#) - 2023 - Let's Create a Game - Part 3 - Control Player Movement (C# Script)", identifier: "O3tXeChXXJA"})-[:BELONGS_TO]-> (unity),
(unityl4:Lesson{title: "Unity for Beginners (C#) - 2023 - Game - Part 4 - Camera Follow Player, and Player Jump", identifier: "1z8nRzfdEg"})-[:BELONGS_TO]-> (unity),
(unityl5:Lesson{title: "Unity for Beginners (C#) - 2023 - Game - Part 5 - Prefabs, Materials and Player Health", identifier: "540bv5zEyOo"})-[:BELONGS_TO]-> (unity),
(unityl6:Lesson{title: "Unity for Beginners (C#) - 2023 - Game - Part 6 - UI Display - Stopwatch", identifier: "M0DCuTzE3dg"})-[:BELONGS_TO]-> (unity),


(blazor)-[:TAUGHT_BY]-> (gavin),
(asp)-[:TAUGHT_BY]-> (gavin),
(unity)-[:TAUGHT_BY]-> (gavin),
(csharp)-[:TAUGHT_BY]-> (gavin),


(john)-[:ENROLLED_IN]-> (blazor),
(jack)-[:ENROLLED_IN]-> (blazor),
(kamala)-[:ENROLLED_IN]-> (blazor),
(ali)-[:ENROLLED_IN]-> (blazor),

(israt)-[:ENROLLED_IN]-> (asp),
(fahim)-[:ENROLLED_IN]-> (asp),

(mikail)-[:ENROLLED_IN]-> (unity),
(mcmillan)-[:ENROLLED_IN]-> (unity),
(simon)-[:ENROLLED_IN]-> (csharp);
