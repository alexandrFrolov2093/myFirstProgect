package lesson20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCoppy {
        public static void main(String[] args) {
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Windows.old\\Users\\sanyfrol\\Pictures\\qqqqq.jpg"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Sanya\\Pictures\\Camera Roll\\zweite.jpg"));

                int c = 0;
                while (true) {
                    c = bis.read();
                    if (c != -1)
                        bos.write(c);
                    else
                        break;
                }
                bis.close();
                bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                bos.close(); //закрываем поток записи (обязательно!)
            }
            catch (java.io.IOException e) {
                System.out.println(e.toString());
            }
        }

    }
