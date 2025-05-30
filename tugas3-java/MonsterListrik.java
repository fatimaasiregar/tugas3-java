public class MonsterListrik extends Monster implements BisaBertarung {
    public MonsterListrik(String nama) {
        super(nama, 80, 30);
    }

    @Override
    public void serang(Monster target) {
        System.out.println(nama + " menyerang " + target.nama);
        target.terimaSerangan(kekuatan);
    }

    @Override
    public void serang(Monster target, String jurus) {
        int damage = kekuatan + 20;
        System.out.println(nama + " menyerang " + target.nama + " dengan jurus " + jurus);
        target.terimaSerangan(damage);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("⚡ [Listrik] " + nama + " - HP: " + kesehatan + " - Status: " + getStatus());
    }
}
