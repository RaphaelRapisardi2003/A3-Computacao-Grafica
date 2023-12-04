package Cena;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;

public class Mouse implements MouseListener {

    // atributos
    private Cena cena;

    public Mouse(Cena cena) {
        this.cena = cena;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        cena.mouseX = (float) ((e.getX() / 5) - cena.largura);
        cena.mouseY = (float) ((e.getY() / 5) - cena.altura) * -1;
        if (cena.mouseHabilitado) {
            switch (cena.iter_telas){
                case 0:

                    break;

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default:
                    break;

            }

        }


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (cena.mouseHabilitado) {
            cena.mouseX = (float) ((e.getX() / 5) - cena.largura);
            cena.mouseY = (float) ((e.getY() / 5) - cena.altura) * -1;

            if (cena.jogador.isJogando() && !cena.jogador.isPausado()) {

                //System.out.println("mouse X: "+(float)((e.getX()/5)-100)+" | mouse Y: "+(float)e.getY());

                //mouse pra direita
                if (cena.mouseX > cena.jogador.getObjSprite().getIntervaloDireita()[0][0]) {
                    cena.jogador.getObjSprite().setMovendo(true);
                    cena.jogador.getObjSprite().setDirecaoX(Direcao.DIREITA);
                }
                // mouse pra esquerda
                if (cena.mouseX < cena.jogador.getObjSprite().getIntervaloEsquerda()[0][1]) {
                    cena.jogador.getObjSprite().setMovendo(true);
                    cena.jogador.getObjSprite().setDirecaoX(Direcao.ESQUERDA);
                }
                // mouse em cima da barra
                if ( cena.mouseX >= cena.jogador.getObjSprite().getIntervaloDireita()[0][0] &&
                        cena.mouseX <= cena.jogador.getObjSprite().getIntervaloEsquerda()[0][1]) {
                    cena.jogador.getObjSprite().setMovendo(false);
                }
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {

    }
}
