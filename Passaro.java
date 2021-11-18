public class Passaro {

    public double x, y;
    public double vy = 0;

    public static double G = 900;
    public static double FLAP = -360;

    public Hitbox box;

    public Passaro(double x, double y){
        this.x = x;
        this.y = y;
        this.box = new Hitbox(x, y, x+34, y+24);
    }

    public void atualiza(double dt){
        vy += G * dt;
        y += vy * dt;

        box.mover(0, vy*dt);
    }

    public void flap(){
        vy = FLAP;
    }

    public void desenhar(Tela t){

        t.imagem("flappy.png", 528, 128, 34, 24, Math.atan(vy/180), x, y);
    }
}