package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OpenNazorat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_nazorat);
        TextView savollar = findViewById(R.id.savollar);
        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");
        String savol;

        switch(tag) {
            case "1":
                savol = "1. O‘zbekistonda energetikaning o‘rnini sharhlab bering.\n" +
                        "2. O‘zbekistonda birinchi qurilgan GESning quvvati necha kVt?\n" +
                        "3. Respublikada mavjud IESlarni sanab bering.\n" +
                        "4. Respublikada mavjud GESlarni sanab o‘ting.\n" +
                        "5. Fanning maqsad va vazifalarini sharhlab bering.\n" +
                        "6. Energetikaning uch jihatlari nimalardan iborat?\n" +
                        "7. Energetika fani to‘g‘risida izoh bering.\n";
                break;
            case "2":
                savol = "1. Elektr energetika yo‘nalishi haqida ma’lumot bering.\n" +
                        "2. Elektr energiyani tashkil etuvchi parametrlari to‘g‘risidagi umumiy ma’lumotlarni sharhlab bering.\n" +
                        "3. O‘zbekiston elektr energetikasining zamonaviy ahvoli qanday?\n" +
                        "4. O‘zbekiston elektr energetika sohasining rivojlanish istiqbol-larini izohlang.\n";
                break;
            case "3":
                savol = "1. Texnika taraqqiyotida energetikaning o‘rnini izohlang.\n" +
                        "2. Energetikaning texnika taraqqiyotiga ta’siri qanday?\n" +
                        "3. Energiya tizimining boshqa tizimlar bilan bog‘liqligini sharhlang.\n" +
                        "4. Foydalanilayotgan energiya manbalarini sanab bering.\n" +
                        "5. Energetikaning kelajagi qanday?\n" +
                        "6. Dunyo mamlakatlari bo‘yicha elektr energiyani ishlab chiqarish strukturasi to‘g‘risida izoh bering.\n" +
                        "7. Dunyo mamlakatlarini elektr energiya ishlab chiqaruvchi energetik resurslar bo‘yicha bo‘lingan guruhlarini sharhlab bering.\n" +
                        "8. Dunyo elektr stansiyalarining o‘rnatilgan quvvatlari qanday?\n";
                break;
            case "4":
                savol = "1. Energiya zaxiralarini tashkil etuvchi manbalar.\n" +
                        "2. Tiklanadigan va tiklanmaydigan energiya zaxiralarini ta’rifi.\n" +
                        "3. Energetik ishlab chiqarish jarayonining asosiy bosqichlarini ta’riflab bering.\n" +
                        "4. Energiya zaxiralarini iste’molining hozirgi kundagi ahvoli.\n" +
                        "5. Noan’aviy tiklanuvchan energiya manbalari (NTEM) to‘g‘risida tushuncha bering.\n";
                break;
            case "5":
                savol = "1. Dunyo sharoitida ko‘mir zaxirasining miqdori va ahvoli haqida ma’lumot bering.\n" +
                        "2. Neft zaxirasi va neft zaxirasining iste’molining o‘sishining asosiy bosqichlari.\n" +
                        "3. Tabiiy gaz zaxirasini dunyo mamlakatlari bo‘yicha taqsimlanishi va zaxirasi.\n" +
                        "4. Atom energiyasi zaxirasining holati va unga bo‘lgan munosabat.\n";
                break;
            case "6":
                savol = "1. SHamol energiyasi zahirasining yil hisobidagi quvvat miqdori.\n" +
                        "2. Quyosh nuri energiyasi zahirasi va uning davr talabidagi holati.\n" +
                        "3. O‘zbekistonda shamol energiyasi zaxiralari.\n" +
                        "4. O‘zbekistonda quyosh energiyasi zaxiralari.\n";
                break;
            case "7":
                savol = "1. Gidroenergetika zaxirasining ahvoli.\n" +
                        "2. Dengiz suvining ko‘tarilish va pasayishidan hosil bo‘ladigan energiya zaxirasi.\n" +
                        "3. Geotermal energiya zaxiralari\n" +
                        "4. Rivojlangan mamlakatlarda gidroenergetika zaxiralari.\n" +
                        "5. Rivojlangan mamlakatlarda geotermal energiya zaxiralari.\n" +
                        "6. Rivojlangan mamlakatlarda boshqa turdagi energiya zaxiralari.\n";
                break;
            case "8":
                savol = "1. Kondensatsion issiqlik elektr stansiyasi va uning ishlash prinsipi.\n" +
                        "2. Barabanli bug‘ qozonining tashkil etuvchi qismlari va uning ishlash sxemasi.\n" +
                        "3. To‘g‘ri oqimli bug‘ qozonining tashkil etuvchi qismlari, ishlash prinsipi va sxemasi.\n" +
                        "4. Bug‘ning soploda harakatlanishi va uning vazifasi.\n" +
                        "5. Turbina, turbinaning turlari va ishlash sxemasi.\n" +
                        "6. Kondensator va uning vazifasi.\n";
                break;
            case "9":
                savol = "1. Issiqlik elektr markazlari haqida tushuncha.\n" +
                        "2. YOqilg‘i iqtisodining issiqlik izolyasiyasi bilan bog‘liqligi.\n" +
                        "3. Gaz-turbina qurilmasining IEM dagi o‘rni.\n" +
                        "4. Gaz-turbina qurilmasining prinsipial sxemasi va ish faoliyati.\n" +
                        "5. Bug‘-gaz qurilmasining ish faoliyati.\n" +
                        "6. O‘zbekistonda mavjud IEM lari to‘g‘risida ma’lumot bering.\n";
                break;
            case "10":
                savol = "1. Issiqlik elektr markazlari haqida tushuncha.\n" +
                        "2. YOqilg‘i iqtisodining issiqlik izolyasiyasi bilan bog‘liqligi.\n" +
                        "3. Gaz-turbina qurilmasining IEM dagi o‘rni.\n" +
                        "4. Gaz-turbina qurilmasining prinsipial sxemasi va ish faoliyati.\n" +
                        "5. Bug‘-gaz qurilmasining ish faoliyati.\n" +
                        "6. O‘zbekistonda mavjud IEM lari to‘g‘risida ma’lumot bering.\n";
                break;
            case "11":
                savol = "1. Suv elektr stansiyasining ishlash prinsipini tushuntiring.\n" +
                        "2. GESlarda to‘g‘on qurish va tayziq hosil qilish jarayonini izohlang.\n" +
                        "3. Turbinalarning GESdagi o‘rni gapirib bering.\n" +
                        "4. Rivojlangan mamlakatlarda mavjud GESlar aytib bering.\n" +
                        "5. O‘zbekistonda mavjud GESlar sanab o‘ting.\n";
                break;
            case "12":
                savol = "1. Suv yig‘ish elektr stansiyalari (SyES, GAES).\n" +
                        "2. Suv to‘lqini elektr stansiyalari (STES).\n" +
                        "3. MiniGESlar va ularning ishlash jarayonlari.\n" +
                        "4. MGD-generator va uning ishlash prinsipi.\n";
                break;
            case "13":
                savol = "1. Quyosh elektr stansiyasining ishlash prinsipi.\n" +
                        "2. Rivojlangan mamlakatlarda mavjud QESlar.\n" +
                        "3. O‘zbekistonda quyosh energiyasidan foydalanish yo‘lida erishilayotgan yutuqlar va loyihalar.\n" +
                        "4. QESlarining kelajakda kutilayotgan istiqbollari.\n";
                break;
            case "14":
                savol = "1. SHamol elektr stansiyasining ishlash prinsipi.\n" +
                        "2. Rivojlangan mamlakatlarda mavjud SHESlar.\n" +
                        "3. SHESlarining kelajakda kutilayotgan istiqbollari.\n";
                break;
            case "15":
                savol = "1. O‘zbekistonda mavjud standart kuchlanishlar, hamda kuchlanishni tanlash sohasini izohlang.\n" +
                        "2. Elektr energiya iste’molchilari to‘g‘risida ma’lumot bering.\n" +
                        "3. Elektr ta’minoti sohasida elektr uskunalarni sharhlang.\n";
                break;
            case "16":
                savol = "1. Energetika tizimi haqidagi tushuncha.\n" +
                        "2. Elektr tarmoqlari, hamda elektr tizimlari tuzilishini tashkil etuvchi elementlar.\n" +
                        "3. Elektr tarmoqlarini o‘z vazifalari bo‘yicha bo‘lingan guruhlari.\n" +
                        "4. Ulanish sxemasi bo‘yicha elektr tarmoqlaring turlari va izohi.\n" +
                        "5. Elektr energiyani xalq xo‘jaligida qo‘llashning o‘ziga xos xususiyatlari.\n" +
                        "6. Elektr energiyasini iste’molining hozirgi davr talabidagi holati.\n";
                break;
            case "17":
                savol = "1. Elektr motorlar haqidagi umumiy tushunchangizni sharhlab bering.\n" +
                        "2. Generatorlar to‘g‘risida izoh bering.\n" +
                        "3. O‘zgarmas tok motorlari haqida ma’lumot bering.\n" +
                        "4. Rivojlangan mamlakatlarda elektr motor va generatorlarni ishlatilish sohasini sharhlang.\n";
                break;
            case "18":
                savol = "1. Tabiatni muhofaza qilishning hozirgi kundagi dolzarb muammo ekanligi haqida tushuncha bering.\n" +
                        "2. Biosfera va taraqqiyot to‘g‘risida izoh qoldiring.\n" +
                        "3. Biosfera tushunchasi, hamda atmosfera vazifasi.\n" +
                        "4. Tabiatni muxofaza qilishni insoniyat ongiga singdirish shakli.\n" +
                        "5. Dunyo miqyosida yoqilg‘i manbalarining tabiatga ta’siri.\n" +
                        "6. SHahar chiqindilarining atrof-muhitga ta’siri va ta’sir doirasi-ni kamaytirish yo‘llari.\n";
                break;
            default:
                savol = "";
                break;
        }
        savollar.setText(savol);
//        Log.d("savol", "savol: "+savol);
    }
}