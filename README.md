# SoftwareLab3

مرحله اول: محاسبه مساحت مستطیل

ابتدا با استفاده از کتابخانهJUnit تست‌های مربوط به محاسبه مساحت مستطیل را در کلاس RecTest می‌نویسیم:

در اینجا objectای از نوع Rectangle میسازیم و با استفاده از متد calculateArea مساحت این مستطیل را محاسبه میکنیم.

<img width="438" alt="1" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/3f0e97bb-5a24-4db5-84d9-006aca882370">


بعد از ران کردن تست، به دلیل عدم وجود کلاس Rectangle با کامپایل ارور زیر مواجه میشویم:
<img width="857" alt="2" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/f7d5d147-f08b-4df5-b31b-fedb7fac7ccd">


برای برطرف کردن این ارور، کلاس Rectangle را ساخته و سپس تست را مجددا ران میکنیم. (کلاس Rectangle جهت رعایت اصول SOLID (LSP, OCP) اینترفیس Type را implement میکند تا نیاز به ایجاد تغییرات مجدد نداشته باشیم)
<img width="440" alt="4" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/09ef79f8-2ede-4550-9a79-d31b6caee7d5">
<img width="470" alt="3" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/b11aa4b5-ba33-45f8-a8dc-ceb3223a65a8">


بعد از اجرای مجدد برنامه، با Runtime Error مواجه میشویم و پس از تغییر متد calculateArea تمامی تستها پاس خواهند شد:

<img width="542" alt="5" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/967c8d76-69d9-40df-8ade-73e55bfc0dc1">
<img width="383" alt="6" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/a2227f1f-38b6-414c-887d-cf3528c44bcd">
<img width="303" alt="7" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/78a44d4d-7378-4c50-9a4f-bf629c749d96">

در مرحله بعد، باید برنامه را طوری تغییر دهیم که امکان تغییر طول و عرض مستطیل وجود داشته باشد. برای این کار از متدهای get و set استفاده میکنیم و پس از اجرای برنامه با ارور زیر مواجه میشویم:

<img width="277" alt="8" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/8ff88ec2-121f-4169-b374-0de5e6c6f18b">
<img width="540" alt="9" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/27b2ee13-1788-4f11-abcd-a6d692fb5fc7">

برای رفع این ارورها توابع set را در کلاس Rectangle اضافه کرده و اگر مجددا برنامه را اجرا کنیم خواهیم دید که تستها با موفقیت پاس میشوند:


<img width="291" alt="10" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/a0b44e58-1a2d-4166-9419-73871cdd3786">

<img width="336" alt="11" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/56f7784d-835c-4bbf-b48d-d5a71f62c75b">

در قدم آخر، از ما خواسته شده تا تغییرات را طوری در برنامه ایجاد کنیم که بتوان مساحت مربع را نیز علاوه بر مستطیل محاسبه کرد. مشابه مرحله قبل، ابتدا تستهای مربوط به محاسبه مساحت مربع را مینویسیم:

<img width="435" alt="12" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/966b7e80-0249-4a50-93df-8127c4642ae9">

همانطور که انتظار میرود پس از اجرای تست با ارور مواجه میشویم و به شکل مشابه کلاس Square را پیاده سازی میکنیم:

<img width="674" alt="13" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/71de021f-4dc6-4e68-867d-cfbddad6a7a3">

<img width="461" alt="14" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/fad82a24-dee4-4378-91cc-9383cb983430">

حال با اجرای تست با خطای زمان اجرا مواجه شده و آن را با تغییر تابع calculateArea برطرف میکنیم:

<img width="699" alt="15" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/2bc20846-3b0e-445f-aca7-17c93e42129c">

<img width="248" alt="16" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/6afb5379-c5dd-4583-b749-6e49ef0a35e0">

تمامی تستها با موفقیت پاس شدند:

<img width="491" alt="17" src="https://github.com/epMahdiyeh/SoftwareLab3/assets/62205305/be5181ea-cd53-487a-8bd4-4f35bf8b64b7">



