/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.settings;

import java.util.HashMap;

/**
 *
 * @author user
 */
final public class Text {
    private static final HashMap<String, String> data = new HashMap();
    public static void init () {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия");

        data.put("JANUARY", "Январь");
        data.put("FEBRUAR", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентябрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");

        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("MENU_SETTINGS", "Настройки");
        data.put("MENU_HELP", "Помощь");
    }
}
 