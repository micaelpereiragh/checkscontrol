# catalogservice

---
`POST /customers`

```json
{
    "name": "zeca afonso",
    "email" : "afdsafds@gmail.com",
    "address": "Pombal",
    "phoneNumber": "+351 29342314",
    "notes": "blablabla"
}
```

```json
{
    "stores": null,
    "checks": null,
    "customerId": "53f2f2a0-6b2f-4c81-ad90-8361589f2795",
    "name": "zeca afonso",
    "email": "afdsafds@gmail.com",
    "address": "Pombal",
    "phoneNumber": "+351 29342314",
    "postalCode": null,
    "notes": "blablabla"
}
```

---

`GET /customers/{id}`

```json
{
    "stores": [],
    "checks": [],
    "customerId": "53f2f2a0-6b2f-4c81-ad90-8361589f2795",
    "name": "zeca afonso",
    "email": "afdsafds@gmail.com",
    "address": "Pombal",
    "phoneNumber": "+351 29342314",
    "postalCode": null,
    "notes": "blablabla"
}
```
---

`GET /customers?name={name}`

```json
[
    {
        "stores": [],
        "checks": [],
        "customerId": "ed20f570-b111-4faa-83d5-6b2a2d044a17",
        "name": "zeca afonso",
        "email": "afdsafds@gmail.com",
        "address": "Pombal",
        "phoneNumber": "+351 29342314",
        "postalCode": null,
        "notes": "blablabla"
    }
]
```