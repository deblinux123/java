

---

## 🗓️ **ماه چهارم: امنیت حرفه‌ای با Spring Security، JWT و OAuth2 + تعامل Vaadin**

### 🎯 اهداف این ماه:

* پیاده‌سازی امنیت با Spring Security
* مهاجرت از JWT دستی به JWT با Security Filter
* ورود با Google (OAuth2) با Spring Security
* کنترل دسترسی در Frontend با Vaadin
* محافظت از فرم‌ها و sessionها

---

## ✅ **هفته اول: آشنایی با Spring Security + مهاجرت JWT**

| روز | موضوع                      | توضیحات                                         | تمرین                               |
| --- | -------------------------- | ----------------------------------------------- | ----------------------------------- |
| 1   | مفاهیم Spring Security     | فیلترها، AuthenticationManager، SecurityContext | کشیدن دیاگرام فیلترهای امنیت        |
| 2   | اضافه‌کردن Spring Security | dependency و پیکربندی اولیه                     | پروژه را امن کن                     |
| 3   | ساخت کلاس JWTFilter        | خواندن و بررسی توکن در هر درخواست               | ثبت توکن در `SecurityContextHolder` |
| 4   | تنظیم WebSecurityConfig    | اجازه دادن به endpointهای عمومی                 | مثل `/login`, `/register`           |
| 5   | تبدیل JWTUtil به Bean      | تزریق در فیلتر JWT                              | استفاده در `doFilterInternal`       |
| 6   | تست Postman                | ارسال توکن و تست دسترسی                         | نقش admin فقط ببیند `/admin/users`  |
| 7   | اتصال کامل با Vaadin       | ارسال توکن از Vaadin و استفاده از Session       | Logout سمت کلاینت و سرور            |

---

## ✅ **هفته دوم: Role-based Access + UI Security در Vaadin**

| روز | موضوع                           | توضیحات                                        | تمرین                             |
| --- | ------------------------------- | ---------------------------------------------- | --------------------------------- |
| 1   | تعریف Role در DB                | جدول جداگانه یا Enum                           | ارتباط ManyToMany یا ساده         |
| 2   | پیاده‌سازی `UserDetailsService` | لود کاربر و نقش‌ها از DB                       | اتصال به Security                 |
| 3   | تنظیم دسترسی در فیلتر           | `hasRole("ADMIN")`, `hasRole("USER")`          | پیاده‌سازی در Spring Security     |
| 4   | نقش‌ها در توکن JWT              | اضافه کردن roles هنگام ساخت                    | بررسی در فیلتر                    |
| 5   | نمایش نقش در UI                 | `Session.getCurrent().getAttribute("role")`    | مخفی کردن منوها برای کاربران عادی |
| 6   | محافظت از Routeها در Vaadin     | بررسی قبل از باز شدن صفحه                      | `BeforeEnterObserver`             |
| 7   | تمرین کامل                      | اپ با مسیرهای `/admin`, `/dashboard`, `/login` | تست تغییر نقش و دسترسی‌ها         |

---

## ✅ **هفته سوم: ورود با OAuth2 (ورود با Google)**

| روز | موضوع                    | توضیحات                              | تمرین                        |
| --- | ------------------------ | ------------------------------------ | ---------------------------- |
| 1   | تفاوت OAuth2 با JWT      | مفاهیم Token Provider، Auth Server   | کشیدن دیاگرام                |
| 2   | اضافه کردن Spring OAuth2 | dependency و تنظیمات Google          | ساخت app در Google Console   |
| 3   | `application.yml` OAuth2 | اضافه کردن Client ID و Secret        | تنظیم مسیر redirect          |
| 4   | تست Login با Google      | `/oauth2/authorization/google`       | لاگین موفق و گرفتن نام کاربر |
| 5   | ذخیره اطلاعات کاربر      | ذخیره ایمیل و نام در DB بعد از login | بررسی موجود بودن کاربر       |
| 6   | اتصال با Vaadin          | نمایش نام کاربر در UI                | صفحه خوش‌آمدگویی             |
| 7   | لاگ‌آوت + Session مدیریت | حذف کوکی‌ها و SecurityContext        | دکمه خروج سمت Vaadin و سرور  |

---

## ✅ **هفته چهارم: پروژه نهایی – Dashboard کامل با دسترسی‌های Role-based**

| روز | موضوع                   | توضیحات                                             | تمرین                                     |
| --- | ----------------------- | --------------------------------------------------- | ----------------------------------------- |
| 1   | طراحی ساختار صفحات      | `/admin`, `/user`, `/login`, `/profile`             | طراحی Wireframe با قلم و کاغذ             |
| 2   | ساخت NavigationBar امن  | فقط لینک‌های مرتبط با نقش نمایش داده شود            | استفاده از `AccessAnnotationChecker`      |
| 3   | فرم‌های CRUD برای Admin | مدیریت کاربران، نقش‌ها                              | فرم Vaadin برای اضافه/ویرایش              |
| 4   | فرم Profile برای User   | تغییر رمز، ویرایش اطلاعات                           | اتصال مستقیم به DB                        |
| 5   | گزارش ورود کاربران      | نمایش لیست loginها با timestamp                     | ذخیره در جدول Log                         |
| 6   | تست امنیت               | تزریق دستی توکن، تست نقش، XSS                       | بررسی فیلترها و Validatorها               |
| 7   | مستندسازی پروژه نهایی   | ساخت README با توضیح Spring Security و JWT و OAuth2 | ثبت مراحل ساخت، اسکرین‌شات‌ها، دیاگرام‌ها |

---

## 🛠 ابزارهای این ماه:

| ابزار                    | کاربرد                |
| ------------------------ | --------------------- |
| Spring Security          | لایه امنیتی اپلیکیشن  |
| Spring OAuth2 Client     | لاگین با Google       |
| JWT (`jjwt`, `java-jwt`) | مدیریت توکن‌ها        |
| Vaadin                   | رابط کاربری امن       |
| Hibernate Validator      | اعتبارسنجی فرم‌ها     |
| Google Cloud Console     | ثبت Client برای OAuth |
| GitHub                   | مستندسازی پروژه نهایی |

---

## ✅ خروجی نهایی ماه چهارم:

* اپلیکیشن کامل با:

  * ورود با فرم JWT + Google Login (OAuth2)
  * Role-based UI و Navigation
  * امنیت پیاده‌سازی‌شده با Spring Security
  * استفاده امن از JWT و Session
  * مستندات دقیق امنیت در GitHub

---

