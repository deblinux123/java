

---

## 🗓️ **ماه سوم: spring security**
---
# 📚 برنامه یادگیری Spring Security (۴ هفته‌ای)

## 📅 هفته ۱ — مفاهیم پایه و شروع
| روز | موضوعات |
|-----|---------|
| ۱   | مفاهیم پایه امنیت وب: Authentication, Authorization, Session, CSRF, XSS, CORS — نصب و آماده‌سازی پروژه Spring Boot |
| ۲   | اضافه کردن وابستگی `spring-boot-starter-security` و بررسی پیکربندی پیش‌فرض |
| ۳   | ساخت کاربر در حافظه (`InMemoryUserDetailsManager`) و نقش‌ها (ROLE_USER, ROLE_ADMIN) — کنترل دسترسی با `authorizeHttpRequests()` |
| ۴   | آشنایی با PasswordEncoder و استفاده از `BCryptPasswordEncoder` |
| ۵   | پروژه عملی: ساخت صفحه Admin و User با محدودیت دسترسی بر اساس نقش |

---

## 📅 هفته ۲ — امنیت با دیتابیس و فرم سفارشی
| روز | موضوعات |
|-----|---------|
| ۱   | ساخت Entity و Repository برای User — بارگذاری کاربران از دیتابیس با `UserDetailsService` |
| ۲   | پیکربندی Spring Security برای استفاده از دیتابیس — ذخیره پسورد Hash شده |
| ۳   | ساخت فرم Login سفارشی با Thymeleaf یا Vaadin |
| ۴   | ساخت صفحه ثبت‌نام (Register) با ولیدیشن ایمیل و پسورد |
| ۵   | پروژه عملی: سیستم کامل Login/Register با دیتابیس و نقش‌ها |

---

## 📅 هفته ۳ — امنیت پیشرفته و JWT
| روز | موضوعات |
|-----|---------|
| ۱   | آشنایی با SecurityFilterChain و Stateless Authentication |
| ۲   | آشنایی با JWT و ایجاد توکن هنگام Login |
| ۳   | اعتبارسنجی توکن در هر درخواست — ساخت فیلتر JWT |
| ۴   | اضافه کردن Refresh Token — جلوگیری از استفاده از توکن منقضی‌شده |
| ۵   | پروژه عملی: API امن با JWT و Role-based Access |

---

## 📅 هفته ۴ — امنیت حرفه‌ای و نکات نهایی
| روز | موضوعات |
|-----|---------|
| ۱   | پیکربندی CORS برای APIها — مقابله با CSRF |
| ۲   | امنیت فرم‌ها و جلوگیری از XSS — استفاده از Content Security Policy |
| ۳   | OAuth2 Login با Google/GitHub — پیکربندی `spring-security-oauth2-client` |
| ۴   | مدیریت Session (زمان انقضا، جلوگیری از Session Fixation) |
| ۵   | تست امنیت با Postman و OWASP ZAP |

---

## 📌 نکات مهم
- هر هفته یک پروژه کوچک انجام بده که همه مباحث اون هفته رو پوشش بده.
- حتما از مستندات رسمی Spring Security استفاده کن.
- روزانه کد بزن و فقط مطالعه تئوری نکن.

---


