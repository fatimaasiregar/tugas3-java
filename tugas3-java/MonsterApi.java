public class MonsterApi extends Monster implements BisaBertarung {
    public MonsterApi(String nama) {
        super(nama, 100, 25);
    }

    @Override
    public void serang(Monster target) {
        System.out.println(nama + " menyerang " + target.nama);
        target.terimaSerangan(kekuatan);
    }

    @Override
    public void serang(Monster target, String jurus) {
        int damage = kekuatan + 15;
        System.out.println(nama + " menyerang " + target.nama + " dengan jurus " + jurus);
        target.terimaSerangan(damage);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("🔥 [Api] " + nama + " - HP: " + kesehatan + " - Status: " + getStatus());
    }
}
