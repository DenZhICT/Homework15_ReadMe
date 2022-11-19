# Проект по автоматизации тестирования DNC

## :scroll: Содержание:

- [Технологии и инструменты](#-технологии-и-инструменты)
- [Реализованные проверки](#-реализованные-проверки)
- [Сборка в Jenkins](#-jenkins-job)
- [Запуск из терминала](#-Запуск-тестов-из-терминала)
- [Allure отчет](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#-примеры-видео-о-прохождении-тестов)

## :hammer_and_wrench: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :memo: Реализованные-проверки

- :white_check_mark: Проверка смены города.
- :white_check_mark: Проверка поисковой системы.
- :white_check_mark: Проверка системы каталога.
- :white_check_mark: Проверка добавления продукта в корзину.
- :white_check_mark: Проверка добавления продукта в список желаемого.
- :white_check_mark: Проверка удалеиня продукта из корзину.
- :white_check_mark: Проверка удаления продукта из список желаемого.
- :white_check_mark: Проверка открытия сайта помощи.

## :man_technologist: Jenkins job

<a target="_blank" href="https://jenkins.autotests.cloud/job/DenisZhICT_Homework15_ReadMe_qa.guru14/">Сборка в Jenkins</a>
<p align="center">
<img src="images/jenkins_job.png" alt="Jenkins"/>
</p>

### Параметры сборки в Jenkins:

* environment (Определят запуск локальный или удалённый)
* test_type (Определят тип запускаемых тестов по Tag'ам)

### :desktop_computer: Запуск тестов из терминала

```bash
gradle clean All
```

### :globe_with_meridians: Удаленный запуск:

```bash
clean 
${TEST_TYPE} 
-Denvironment=${ENVIRONMENT}
```

## :bar_chart: Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/DenisZhICT_Homework15_ReadMe_qa.guru14/11/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>


## :grapes: Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>

### :film_strip: Пример видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video">
</p>