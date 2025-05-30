public class MonsterAir extends Monster implements BisaBertarung, BisaMenyembuhkan {
    public MonsterAir(String nama) {
        super(nama, 90, 20);
    }

    @Override
    public void serang(Monster target) {
        System.out.println(nama + " menyerang " + target.nama);
        target.terimaSerangan(kekuatan);
    }

    @Override
    public void serang(Monster target, String jurus) {
        int damage = kekuatan + 10;
        System.out.println(nama + " menyerang " + target.nama + " dengan jurus " + jurus);
        target.terimaSerangan(damage);
    }

    @Override
    public void sembuhkan() {
        kesehatan += 20;
        System.out.println(nama + " menyembuhkan diri +20 HP");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("💧 [Air] " + nama + " - HP: " + kesehatan + " - Status: " + getStatus());
    }
}
