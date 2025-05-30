import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> arena = new ArrayList<>();

        MonsterApi api = new MonsterApi("Inferno");
        MonsterAir air = new MonsterAir("Aqualux");
        MonsterListrik listrik = new MonsterListrik("Voltaris");

        arena.add(api);
        arena.add(air);
        arena.add(listrik);

        System.out.println("📜 Daftar Monster di Arena:");
        for (Monster m : arena) {
            m.tampilkanInfo();
        }

        System.out.println("\n⚔️ Pertarungan Dimulai:");
        api.serang(air);
        air.serang(api, "Gelombang Tsunami");
        listrik.serang(air, "Petir Menyambar");
        air.sembuhkan();
        listrik.serang(api);
        api.serang(listrik, "Lidah Api Neraka");

        System.out.println("\n📊 Status Akhir:");
        for (Monster m : arena) {
            m.tampilkanInfo();
        }
    }
}
