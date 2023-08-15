# Сортировка слиянием фалов 
Данная программа делает *Сортировку слиянием* нескольких файлов нескольких файлов.

* версия Java 19
* система сборки Maven версия 3.10.1


# Инструкция по запуску

Параметры программы задаются при запуске через аргументы командной строки, по порядку:
1. режим сортировки (-a или -d), необязательный, по умолчанию сортируем по возрастанию;
2. тип данных (-s или -i), обязательный;
3. имя выходного файла, обязательное;
4. остальные параметры – имена входных файлов, не менее одного.

Примеры запуска из командной строки для Windows:

java Main.java -i -a out.txt in.txt (для целых чисел по возрастанию)

java Main.java -s out.txt in1.txt in2.txt in3.txt (для строк по возрастанию)

java Main.java -d -s out.txt in1.txt in2.txt (для строк по убыванию)


