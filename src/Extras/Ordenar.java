package Extras;

import D3r3_k.Inicio;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Ordenar extends Thread {

    public static db_datos[] datos = new db_datos[2];
    public static db_datos[] original;

    public static db_datos[] redimOrdenados(db_datos[] arr) {
        db_datos[] temp = new db_datos[datos.length + 1];
        for (int i = 0; i < datos.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static boolean capacidadOrdenados(db_datos[] arr) {
        boolean capacidad = false;
        for (int i = 0; i < datos.length; i++) {
            if (arr[i] == null) {
                capacidad = true;
                break;
            }
        }
        return capacidad;
    }

    private int metodo = -1;
    private int orden = -1;
    private db_datos[] arr = null;

    @Override
    public void run() {
        EmpezarOrden(metodo, orden, arr);
    }

    public void Ordenar(int _metodo, int _orden, db_datos[] _arr) {
        this.metodo = _metodo;
        this.orden = _orden;
        this.arr = _arr;
        this.original = arr.clone();
    }

    //  ORDEN = 0  || ORDEN 1
    // ASENDENTE   || DESENDENTE
    // METODO = 0  || METODO 1
    // QUICKSORT   || BURBUJA
    
    private void EmpezarOrden(int metodo, int orden, db_datos[] arr) {
        if (orden == 0) {
            if (metodo == 0) {
                shellSort(true, arr);
            } else if (metodo == 1) {
                burbuja(true, arr);
            }
        } else if (orden == 1) {
            if (metodo == 0) {
                shellSort(false, arr);
            } else if (metodo == 1) {
                burbuja(false, arr);
            }
        }
    }

    private void shellSort(boolean orden, db_datos[] arr) {
        if (orden) {
            try {
                System.out.println("Orden Asendente| Metodo 1");
                int pasos = 1;
                db_datos temp = null;
                int n = arr.length;

                for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
                    for (int i = intervalo; i < n; i += 1) {
                        temp = arr[i];
                        int j;
                        if (temp != null) {
                            for (j = i; j >= intervalo && arr[j - intervalo].getValor() > temp.getValor(); j -= intervalo) {
                                arr[j] = arr[j - intervalo];
                            }
                            arr[j] = temp;
                            Graficar(arr);

                            Inicio.txt_pasos.setText(String.valueOf(pasos++));

                            sleep(1000);
                        }

                    }
                }

                Cronometro cro = new Cronometro(0, 0);
                cro.parar();

                Inicio.activar();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("Orden Desendente| Metodo 1");
                int pasos = 1;
                db_datos temp = null;
                int n = arr.length;

                for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
                    for (int i = intervalo; i < n; i += 1) {
                        temp = arr[i];
                        int j;
                        if (temp != null) {
                            for (j = i; j >= intervalo && arr[j - intervalo].getValor() < temp.getValor(); j -= intervalo) {
                                arr[j] = arr[j - intervalo];
                            }
                            arr[j] = temp;
                            Graficar(arr);

                            Inicio.txt_pasos.setText(String.valueOf(pasos++));

                            sleep(1000);
                        }

                    }
                }

                Cronometro cro = new Cronometro(0, 0);
                cro.parar();

                Inicio.activar();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void burbuja(boolean orden, db_datos[] arr) {
        if (orden) {
            try {
                System.out.println("Orden Ascendente | Burbuja");
                int pasos = 1;
                int n = arr.length;
                db_datos temp;
                for (int i = 1; i < n; i++) {
                    for (int j = 1; j < (n - i); j++) {
                        if (arr[j] != null) {
                            if (arr[j - 1].getValor() > arr[j].getValor()) {
                                temp = arr[j - 1];
                                arr[j - 1] = arr[j];
                                arr[j] = temp;

                                Graficar(arr);

                                Inicio.txt_pasos.setText(String.valueOf(pasos++));

                                sleep(1000);

                            }
                        }

                    }
                }

                Cronometro cron = new Cronometro(0, 0);
                cron.parar();

                Inicio.activar();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("Orden Descendente | Burbuja");
                int pasos = 1;
                int n = arr.length;
                db_datos temp;
                for (int i = 1; i < n; i++) {
                    for (int j = 1; j < (n - i); j++) {
                        if (arr[j] != null) {
                            if (arr[j - 1].getValor() < arr[j].getValor()) {
                                temp = arr[j - 1];
                                arr[j - 1] = arr[j];
                                arr[j] = temp;

                                Graficar(arr);

                                Inicio.txt_pasos.setText(String.valueOf(pasos++));

                                sleep(1000);
                            }
                        }

                    }
                }

                Cronometro cron = new Cronometro(0, 0);
                cron.parar();

                Inicio.activar();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void Graficar(db_datos[] arr) {
        Inicio.panel_grafica.removeAll();
        String titulo = Inicio.input_tituloGrafica.getText();

        DefaultCategoryDataset gValores = new DefaultCategoryDataset();

        for (db_datos arr1 : arr) {
            if (arr1 != null) {
                gValores.setValue(arr1.getValor(), arr1.getPais(), "");
            }
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart3D(titulo, "Paises", "valores", gValores, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(530, 500));

        Inicio.panel_grafica.setLayout(new BorderLayout());
        Inicio.panel_grafica.add(panel, BorderLayout.NORTH);
        Inicio.panel_grafica.repaint();
        Inicio.panel_grafica.validate();
    }

}
