
package minicad;

import java.awt.*;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;

import java.awt.geom.*;

import java.io.*;

import java.util.ArrayList;

import javax.swing.*;
public class Minicad extends javax.swing.JFrame{

   public Minicad(){
       initComponents();



        setLocationRelativeTo(null);
   }

private static Color color = Color.BLUE;



    int xs, ys, xe, ye;



    public double x_original;

    public double y_original;



    Point2D.Double primerClick;



    Point2D.Double clickPrevio;



    public double x, y;



    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    private void initComponents() {



        grupoHerramientas = new javax.swing.ButtonGroup();

        jTabbedPane2 = new javax.swing.JTabbedPane();

        pHerramientas = new javax.swing.JPanel();

        btnLinea = new javax.swing.JToggleButton();

        btnRectangulo = new javax.swing.JToggleButton();

        jLabel1 = new javax.swing.JLabel();

        jSeparator1 = new javax.swing.JSeparator();

        btnElipse = new javax.swing.JToggleButton();

        jLabel2 = new javax.swing.JLabel();

        jSeparator2 = new javax.swing.JSeparator();

        jLabel3 = new javax.swing.JLabel();

        jSeparator3 = new javax.swing.JSeparator();

        btnTamanio = new javax.swing.JToggleButton();

        btnColor = new javax.swing.JButton();

        btnSeleccionar = new javax.swing.JToggleButton();

        labelCoordenadas = new javax.swing.JLabel();

        labelPosicion = new javax.swing.JLabel();

        btnRotar = new javax.swing.JToggleButton();

        btnTrasladar = new javax.swing.JToggleButton();

        dibujador = new Canvas();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("MiniCad");

        setForeground(new java.awt.Color(240, 240, 240));

        setMinimumSize(new java.awt.Dimension(800, 600));



        jTabbedPane2.setMaximumSize(new java.awt.Dimension(500, 32767));

        jTabbedPane2.setMinimumSize(new java.awt.Dimension(200, 60));

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(200, 100));



        grupoHerramientas.add(btnLinea);

        btnLinea.setText("Linea");

        btnLinea.setPreferredSize(new java.awt.Dimension(110, 23));



        grupoHerramientas.add(btnRectangulo);

        btnRectangulo.setText("Rectangulo");

        btnRectangulo.setPreferredSize(new java.awt.Dimension(110, 23));



        jLabel1.setText("Formas para dibujo");



        grupoHerramientas.add(btnElipse);

        btnElipse.setText("Circulo");

        btnElipse.setPreferredSize(new java.awt.Dimension(110, 23));



        jLabel2.setText("Colores");



        jLabel3.setText("Transformaciones");



        grupoHerramientas.add(btnTamanio);

        btnTamanio.setText("Tamaño");

        btnTamanio.setPreferredSize(new java.awt.Dimension(110, 23));



        btnColor.setText("Cambiar color");

        btnColor.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btnColorActionPerformed(evt);

            }

        });



        grupoHerramientas.add(btnSeleccionar);

        btnSeleccionar.setText("Seleccionar");



        labelCoordenadas.setText("Coordenadas:");



        labelPosicion.setText("Posición:");



        grupoHerramientas.add(btnRotar);

        btnRotar.setText("Rotar");

        btnRotar.setPreferredSize(new java.awt.Dimension(110, 23));



        grupoHerramientas.add(btnTrasladar);

        btnTrasladar.setText("Trasladar");

        btnTrasladar.setPreferredSize(new java.awt.Dimension(110, 23));



        javax.swing.GroupLayout pHerramientasLayout = new javax.swing.GroupLayout(pHerramientas);

        pHerramientas.setLayout(pHerramientasLayout);

        pHerramientasLayout.setHorizontalGroup(

                pHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addComponent(jSeparator1)

                        .addComponent(jSeparator2)

                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)

                        .addGroup(pHerramientasLayout.createSequentialGroup()

                                .addContainerGap()

                                .addGroup(pHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addComponent(btnElipse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(btnRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(jLabel1)

                                        .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addGroup(pHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                                .addComponent(jLabel2)

                                                .addComponent(jLabel3)

                                                .addComponent(btnTamanio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                                .addComponent(btnColor)

                                                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))

                                        .addComponent(labelCoordenadas)

                                        .addComponent(labelPosicion)

                                        .addComponent(btnRotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addContainerGap(75, Short.MAX_VALUE))

        );

        pHerramientasLayout.setVerticalGroup(

                pHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(pHerramientasLayout.createSequentialGroup()

                                .addGap(16, 16, 16)

                                .addComponent(jLabel1)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(3, 3, 3)

                                .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(btnRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(btnElipse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(btnSeleccionar)

                                .addGap(1, 1, 1)

                                .addComponent(jLabel2)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(btnColor)

                                .addGap(15, 15, 15)

                                .addComponent(jLabel3)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(3, 3, 3)

                                .addComponent(btnRotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(btnTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(btnTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(1, 1, 1)

                                .addComponent(labelCoordenadas)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addComponent(labelPosicion)

                                .addContainerGap(204, Short.MAX_VALUE))

        );



        jTabbedPane2.addTab("Opciones", pHerramientas);



        getContentPane().add(jTabbedPane2, java.awt.BorderLayout.LINE_START);



        dibujador.setBackground(new java.awt.Color(255, 255, 255));

        dibujador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dibujador.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        dibujador.setMaximumSize(new java.awt.Dimension(370000, 3000));

        javax.swing.GroupLayout dibujadorLayout = new javax.swing.GroupLayout(dibujador);

        dibujador.setLayout(dibujadorLayout);

        dibujadorLayout.setHorizontalGroup(

                dibujadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGap(0, 737, Short.MAX_VALUE)

        );

        dibujadorLayout.setVerticalGroup(

                dibujadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGap(0, 645, Short.MAX_VALUE)

        );



        getContentPane().add(dibujador, java.awt.BorderLayout.CENTER);



        pack();

    }// </editor-fold>                                                



    public static void main(String args[]) {

        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.

         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 

         */

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Windows".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;



                }

            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(MiniCad.class

                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>



        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() -> {

            new Minicad().setVisible(true);

        });

    }



    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {

        dibujador.current_color = JColorChooser.showDialog(null, "Choose Color", Color.BLACK);

        if (dibujador.figura_seleccionada instanceof Text2D) {

            ((Text2D) dibujador.figura_seleccionada).color = dibujador.current_color;

        } else if (dibujador.figura_seleccionada instanceof Linea) {

            ((Linea) dibujador.figura_seleccionada).color = dibujador.current_color;

        } else if (dibujador.figura_seleccionada instanceof Rectangulo) {

            ((Rectangulo) dibujador.figura_seleccionada).color = dibujador.current_color;

        } else if (dibujador.figura_seleccionada instanceof Elipse) {

            ((Elipse) dibujador.figura_seleccionada).color = dibujador.current_color;

        }

        System.out.println("color:" + dibujador.current_color);

    }

    public void  Rotar( ){
    }


    class Canvas extends JComponent {



        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Color current_color = Color.BLACK;

        public Shape figura_seleccionada;

        double p_x, p_y;

        Point2D.Double primer_click;



        Point2D.Double click_previo;



        public double x_original;     // x2 y y2 en Lineas, w y h en rectangulos y circulos

        public double y_original;



        public Canvas() {

            this.addMouseListener(new MouseAdapter() {



                public void mouseClicked(MouseEvent e) {



                    // SELECCION DE FIGURA

                    if (btnSeleccionar.isSelected()) {

                        boolean found = false;

                        for (Shape s : shapes) {

                            if (s instanceof Linea) {

                           

                                //SI LA DISTANCIA DE LA LINEA CON RESPECTO AL PUNTO DE CLICK ES MENOR QUE 2

                                // ENTONCES HEMOS ENCONTRADO LA LINEA A SELECCIONAR

                                if (((Linea) s).ptLineDist(e.getX(), e.getY()) < 2) {

                                    figura_seleccionada = s;

                                    found = true;

                                    break;

                                }

                            } //SI NO ES UNA LINEA VERIFICAMOS QUE DONDE SE HA HECHO CLICK 

                            // CONTIENE UNA FIGURA

                            else if (s.contains(e.getX(), e.getY())) {

                                figura_seleccionada = s;

                                found = true;

                                break;

                            }

                        }



                        if (!found) {

                            figura_seleccionada = null;

                            x_original = 0;

                            y_original = 0;

                        }



                        //SI HEMOS SELECCIONADO UNA FIGURA 

                        if (figura_seleccionada != null) {



                            //SI LA FIGURA SELECCIONADA ES UNEA LINEA RECUPERAMOS LAS COORDENADAS DEL PUNTO 2

                            if (figura_seleccionada instanceof Linea) {

                                x_original = ((Linea) figura_seleccionada).getX2();

                                y_original = ((Linea) figura_seleccionada).getY2();

                            } // SINNO ES UNA LINEA RECUPERA ANCHURA Y SU ALTURA

                            else if (figura_seleccionada instanceof Rectangle2D) {

                                x_original = ((Rectangulo) figura_seleccionada).getWidth();

                                y_original = ((Rectangulo) figura_seleccionada).getHeight();

                            } else if (figura_seleccionada instanceof Ellipse2D) {

                                x_original = ((Elipse) figura_seleccionada).getWidth();

                                y_original = ((Elipse) figura_seleccionada).getHeight();

                            }

                        }

                        repaint();

                    } // Primer click

                    else if (primer_click == null) {

                        primer_click = new Point2D.Double(e.getX(), e.getY());

                        p_x = e.getX();

                        p_y = e.getY();



                        if (btnLinea.isSelected()) {

                            createLine(p_x, p_y, dibujador.current_color);

                        } else if (btnRectangulo.isSelected()) {

                            createRectangle(p_x, p_y, dibujador.current_color);

                        } else if (btnElipse.isSelected()) {

                            createEllipse(p_x, p_y, dibujador.current_color);

                            repaint();

                        }

                    } //Segundo Click

                    else {

                        figura_seleccionada = null;

                        primer_click = null;

                        p_x = 0;

                        p_y = 0;

                        repaint();

                    }

                }



                public void mouseReleased(MouseEvent e) {

                    click_previo = null;

                    if (figura_seleccionada != null) {

                        if (figura_seleccionada instanceof Linea) {

                            x_original = ((Linea) figura_seleccionada).getX2();

                            y_original = ((Linea) figura_seleccionada).getY2();

                        } else if (figura_seleccionada instanceof Rectangulo) {

                            x_original = ((Rectangulo) figura_seleccionada).getWidth();

                            y_original = ((Rectangulo) figura_seleccionada).getHeight();

                        } else if (figura_seleccionada instanceof Elipse) {

                            x_original = ((Elipse) figura_seleccionada).getWidth();

                            y_original = ((Elipse) figura_seleccionada).getHeight();

                        }

                    }

                }



            });



            this.addMouseMotionListener(new MouseMotionAdapter() {



                public void mouseMoved(MouseEvent e) {

                    if (primer_click != null) {

                        double c_x = e.getX();      // cursor x

                        double c_y = e.getY();      // cursor y

                        if (btnLinea.isSelected()) {

                            ((Linea) figura_seleccionada).setLine(p_x, p_y, c_x, c_y);

                        } else if (btnRectangulo.isSelected()) {

                            ((Rectangulo) figura_seleccionada).setRect(Math.min(p_x, c_x), Math.min(p_y, c_y), Math.abs(p_x - c_x), Math.abs(p_y - c_y));

                        } else if (btnElipse.isSelected()) {

                            double radius = primer_click.distance(c_x, c_y);

                            ((Elipse) figura_seleccionada).setFrame(c_x - radius, c_y - radius, 2 * radius, 2 * radius);

                        }

                        repaint();

                    }

                }



                // Mover y escalar

                public void mouseDragged(MouseEvent e) {

                    if (btnTrasladar.isSelected()) {

                        if (figura_seleccionada != null) {

                            if (click_previo == null) {

                                click_previo = new Point2D.Double(e.getX(), e.getY());

                            }

                            if (figura_seleccionada instanceof Line2D) {

                                ((Linea) figura_seleccionada).setLine(

                                        ((Linea) figura_seleccionada).getX1() + e.getX() - click_previo.getX(),

                                        ((Linea) figura_seleccionada).getY1() + e.getY() - click_previo.getY(),

                                        ((Linea) figura_seleccionada).getX2() + e.getX() - click_previo.getX(),

                                        ((Linea) figura_seleccionada).getY2() + e.getY() - click_previo.getY());

                            } else if (figura_seleccionada instanceof Rectangle2D) {

                                ((Rectangulo) figura_seleccionada).setRect(

                                        ((Rectangulo) figura_seleccionada).getX() + e.getX() - click_previo.getX(),

                                        ((Rectangulo) figura_seleccionada).getY() + e.getY() - click_previo.getY(),

                                        ((Rectangulo) figura_seleccionada).getWidth(),

                                        ((Rectangulo) figura_seleccionada).getHeight());

                            } else if (figura_seleccionada instanceof Ellipse2D) {

                                ((Elipse) figura_seleccionada).setFrame(

                                        ((Elipse) figura_seleccionada).getX() + e.getX() - click_previo.getX(),

                                        ((Elipse) figura_seleccionada).getY() + e.getY() - click_previo.getY(),

                                        ((Elipse) figura_seleccionada).getWidth(),

                                        ((Elipse) figura_seleccionada).getHeight());

                            } else if (figura_seleccionada instanceof Text2D) {

                                ((Text2D) figura_seleccionada).setLocation(

                                        ((Text2D) figura_seleccionada).x + e.getX() - click_previo.getX(),

                                        ((Text2D) figura_seleccionada).y + e.getY() - click_previo.getY());

                            }

                        }

                        click_previo = new Point2D.Double(e.getX(), e.getY());

                        repaint();

                    }

                    if (btnTamanio.isSelected()) {

                        if (dibujador.figura_seleccionada != null) {

                            double c_x = e.getX();      // cursor x

                            double c_y = e.getY();

                            if (dibujador.figura_seleccionada instanceof Linea) {

                                ((Linea) dibujador.figura_seleccionada).setLine(

                                        ((Linea) dibujador.figura_seleccionada).getX1(),

                                        ((Linea) dibujador.figura_seleccionada).getY1(), c_x, c_y);



                            } else if (dibujador.figura_seleccionada instanceof Rectangulo) {

                                ((Rectangulo) dibujador.figura_seleccionada).setRect(

                                        ((Rectangulo) dibujador.figura_seleccionada).getX(),

                                        ((Rectangulo) dibujador.figura_seleccionada).getY(),

                                        Math.abs(p_x - c_x) - ((Rectangulo) dibujador.figura_seleccionada).getX(),

                                         Math.abs(p_y - c_y) - ((Rectangulo) dibujador.figura_seleccionada).getY());



                            } else if (dibujador.figura_seleccionada instanceof Elipse) {

                                ((Elipse) dibujador.figura_seleccionada).setFrame(

                                        ((Elipse) dibujador.figura_seleccionada).getX(),

                                        ((Elipse) dibujador.figura_seleccionada).getY(),

                                        Math.abs(p_x - c_x) - ((Elipse) dibujador.figura_seleccionada).getX(),

                                        Math.abs(p_y - c_y) - ((Elipse) dibujador.figura_seleccionada).getY()

                                );

                            }

                        }

                        repaint();

                    }



                    if (btnRotar.isSelected()) {

                        AffineTransform at = new AffineTransform();

                        if (figura_seleccionada != null) {
                            if (dibujador.figura_seleccionada != null){}
                               double c_x = e.getX();      // cursor x

                              double c_y = e.getY();

                            



                        }

                        if (dibujador.figura_seleccionada instanceof Linea) {



                        } else if (dibujador.figura_seleccionada instanceof Rectangulo) {



                        } else if (dibujador.figura_seleccionada instanceof Elipse) {



                        }

                    }

                    click_previo = new Point2D.Double(e.getX(), e.getY());

                    repaint();

                }



            });



        }



        public class ImageTransform {



            private AffineTransform at;

            private double grados;



            public ImageTransform(Linea alturaImagen, Linea anchuraImagen) {

                at = new AffineTransform();



            }



            public AffineTransform getTransform() {

                return at;

            }

        }



        public void paint(Graphics g) {

            Graphics2D g2 = (Graphics2D) g;

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            AffineTransform at = new AffineTransform();

            at.rotate(45 * Math.PI / 180);

            for (Shape s : shapes) {

                if (s == figura_seleccionada) {

                    if (s instanceof Text2D) {

                        g.setFont(new Font("TimesRoman", Font.PLAIN, ((Text2D) s).fontsize));

                        g.setColor(Color.RED);

                        g.drawString(((Text2D) s).str, (int) ((Text2D) s).x, (int) ((Text2D) s).y);

                    } else {

                        g2.setStroke(new BasicStroke(3));

                        g2.setPaint(Color.RED);

                        g2.draw(s);

                    }

                } else {

                    if (s instanceof Text2D) {

                        g.setFont(new Font("TimesRoman", Font.PLAIN, ((Text2D) s).fontsize));

                        g.setColor(((Text2D) s).color);

                        g.drawString(((Text2D) s).str, (int) ((Text2D) s).x, (int) ((Text2D) s).y);

                    } else {

                        g2.setStroke(new BasicStroke(1));

                        if (s instanceof Linea) {

                            g2.setPaint(((Linea) s).color);

                        } else if (s instanceof Rectangulo) {

                            g2.setPaint(((Rectangulo) s).color);

                        } else if (s instanceof Elipse) {

                            g2.setPaint(((Elipse) s).color);

                        }

                        g2.draw(s);

                    }

                }

            }

        }
        



        public void createLine(double x, double y, Color color) {

            //Line2D.Double tmp= new Line2D.Double(x, y, x, y);

            Linea tmp = new Linea(x, y, x, y, color);

            shapes.add(tmp);

            figura_seleccionada = tmp;

        }



        public void createRectangle(double x, double y, Color color) {

            //Rectangle2D.Double tmp= new Rectangle2D.Double(x, y, 0, 0);

            Rectangulo.Double tmp = new Rectangulo(x, y, 0, 0, color);

            shapes.add(tmp);

            figura_seleccionada = tmp;

        }



        public void createEllipse(double x, double y, Color color) {

            //Ellipse2D.Double tmp= new Ellipse2D.Double(x, y, 0, 0);

            Elipse.Double tmp = new Elipse(x, y, 0, 0, color);

            shapes.add(tmp);

            figura_seleccionada = tmp;

        }



        public void createText(String str, double x, double y, Color color) {

            Text2D tmp = new Text2D(str, x, y, color);

            shapes.add((Shape) tmp);

            figura_seleccionada = (Shape) tmp;

        }
     

    }



    // Variables declaration - do not modify                     

    private javax.swing.JButton btnColor;

    private javax.swing.JToggleButton btnElipse;

    private javax.swing.JToggleButton btnLinea;

    private javax.swing.JToggleButton btnRectangulo;

    private javax.swing.JToggleButton btnSeleccionar;

    private javax.swing.JToggleButton btnTamanio;

    private javax.swing.JToggleButton btnRotar;

    private javax.swing.JToggleButton btnTxt;

    private javax.swing.JTextField campoTxt;

    private Canvas dibujador;

    private javax.swing.ButtonGroup grupoHerramientas;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JSeparator jSeparator1;

    private javax.swing.JSeparator jSeparator2;

    private javax.swing.JSeparator jSeparator3;

    private javax.swing.JTabbedPane jTabbedPane2;

    private javax.swing.JLabel labelCoordenadas;

    private javax.swing.JLabel labelPosicion;

    private javax.swing.JPanel pHerramientas;

    private javax.swing.JToggleButton btnTrasladar;

    // End of variables declaration                   

}



//LISTA DE FIGURAS QUE SE RENDERIZAN EN EL CANVAS

class Linea extends Line2D.Double implements Serializable {



    Color color;



    public Linea(double x1, double y1, double x2, double y2, Color color) {

        super(x1, y1, x2, y2);

        this.color = color;

    }



}



class Rectangulo extends Rectangle2D.Double implements Serializable {



    Color color;



    public Rectangulo(double x1, double y1, double w, double h, Color color) {

        super(x1, y1, w, h);

        this.color = color;

    }

}



class Elipse extends Ellipse2D.Double implements Serializable {



    Color color;



    public Elipse(double x1, double y1, double w, double h, Color color) {

        super(x1, y1, w, h);

        this.color = color;

    }

}



class Text2D implements Shape, Serializable {



    public String str;

    public double x;

    public double y;

    int fontsize = 25;

    Color color = Color.BLACK;



    public Text2D(String str, double x, double y, Color color) {

        this.str = str;

        this.x = x;

        this.y = y;

        this.color = color;

    }



    public boolean contains(double x, double y, double w, double h) {

        return false;

    }



    public boolean contains(double x, double y) {

        Point2D tmp = new Point2D.Double(x, y);

        if (tmp.distance(this.x, this.y) < 25 && x > this.x && y < this.y) {

            tmp = null;

            return true;

        } else {

            tmp = null;

            return false;

        }

    }



    public boolean contains(Point2D p) {

        return true;

    }



    public boolean contains(Rectangle2D r) {

        return true;

    }



    public Rectangle getBounds() {

        return null;

    }



    public Rectangle2D getBounds2D() {

        return null;

    }



    public PathIterator getPathIterator(AffineTransform at, double flatness) {

        return null;

    }



    public PathIterator getPathIterator(AffineTransform at) {

        return null;

    }



    public boolean intersects(double x, double y, double w, double h) {

        return true;

    }



    public boolean intersects(Rectangle2D r) {

        return true;

    }



    public void setLocation(double x, double y) {

        this.x = x;

        this.y = y;

    }

}
