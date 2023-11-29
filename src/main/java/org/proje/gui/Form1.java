package org.proje.gui;

import org.proje.gui.tableModels.*;
import org.proje.jdbc.dao.*;
import org.proje.jdbc.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Form1 extends JFrame {
    private JPanel panel1;
    private JButton personelBilgisiButton;
    private JButton öğrenciBilgisiButton;
    private JButton dersBilgisiButton;
    private JButton giderBilgisiButton;
    private JButton stokBilgisiButton;
    private JLabel gelenBilgiLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel personelLabel;
    private JLabel studentLabel;
    private JLabel dersLabel;
    private JLabel giderLabel;
    private JLabel stokLabel;
    private JComboBox persCombo;
    private JLabel persAtt;
    private JLabel stuAtt;
    private JLabel dersAtt;
    private JLabel giderAtt;
    private JLabel stokAtt;
    private JButton persAttButton;
    private JButton stuAttButton;
    private JButton dersAttButton;
    private JButton giderAttButton;
    private JButton stokAttButton;
    private JComboBox stuCombo;
    private JComboBox dersCombo;
    private JComboBox giderCombo;
    private JComboBox stokCombo;
    private JTextField PersonelAtt;
    private JTextField StudentAtt;
    private JTextField DersAtt;
    private JTextField GiderAtt;
    private JTextField StokAtt;
    private JTable table1;
    private JButton dersEkleButton;

    public void closeAllBut(int i) {
        switch (i) {
            case 1:
                kapatStokBilgisi();
                kapatDersBilgisi();
                kapatGiderBilgisi();
                kapatStudentBilgisi();
                break;
            case 2:
                kapatPersonelBilgisi();
                kapatStokBilgisi();
                kapatGiderBilgisi();
                kapatDersBilgisi();
                break;
            case 3:
                kapatPersonelBilgisi();
                kapatStudentBilgisi();
                kapatGiderBilgisi();
                kapatStokBilgisi();
                break;
            case 4:
                kapatPersonelBilgisi();
                kapatStudentBilgisi();
                kapatDersBilgisi();
                kapatStokBilgisi();
                break;
            case 5:
                kapatPersonelBilgisi();
                kapatStudentBilgisi();
                kapatDersBilgisi();
                kapatGiderBilgisi();
                break;
            default:
                System.out.println("Error while closing tabs");
        }
    }

    public void kapatPersonelBilgisi() {
        persAtt.setVisible(false);
        persCombo.setVisible(false);
        PersonelAtt.setVisible(false);
        button1.setVisible(false);
        personelLabel.setVisible(false);
    }

    public void kapatDersBilgisi() {
        dersAtt.setVisible(false);
        dersCombo.setVisible(false);
        DersAtt.setVisible(false);
        button2.setVisible(false);
        dersLabel.setVisible(false);
    }

    public void kapatStudentBilgisi() {
        stuAtt.setVisible(false);
        stuCombo.setVisible(false);
        StudentAtt.setVisible(false);
        button3.setVisible(false);
        studentLabel.setVisible(false);
        dersEkleButton.setVisible(false);
    }

    public void kapatGiderBilgisi() {
        giderAtt.setVisible(false);
        giderCombo.setVisible(false);
        GiderAtt.setVisible(false);
        button4.setVisible(false);
        giderLabel.setVisible(false);
    }

    public void kapatStokBilgisi() {
        stokAtt.setVisible(false);
        stokCombo.setVisible(false);
        StokAtt.setVisible(false);
        button5.setVisible(false);
        stokLabel.setVisible(false);
    }

    public Form1() {

        $$$setupUI$$$();
        try {
            DAO dao = new DAO();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Error:" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        add(panel1);
        this.setTitle("Bilgi Uygulaması");
        //this.setSize(400, 300);
        this.setBounds(200, 100, 1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        StudentAtt.setVisible(false);
        PersonelAtt.setVisible(false);
        DersAtt.setVisible(false);
        GiderAtt.setVisible(false);
        StokAtt.setVisible(false);
        personelLabel.setVisible(false);
        studentLabel.setVisible(false);
        dersLabel.setVisible(false);
        giderLabel.setVisible(false);
        stokLabel.setVisible(false);
        persCombo.setVisible(false);
        stuCombo.setVisible(false);
        dersCombo.setVisible(false);
        giderCombo.setVisible(false);
        stokCombo.setVisible(false);
        persAtt.setVisible(false);
        stuAtt.setVisible(false);
        dersAtt.setVisible(false);
        giderAtt.setVisible(false);
        stokAtt.setVisible(false);
        dersEkleButton.setVisible(false);
        //persAttButton.setVisible(false);
        //stuAttButton.setVisible(false);
        //dersAttButton.setVisible(false);
        //giderAttButton.setVisible(false);
        //stokAttButton.setVisible(false);

        persCombo.addItem("Personel Numarası");
        persCombo.addItem("Personel Adı");
        persCombo.addItem("Personel Soyadı");
        persCombo.addItem("Personel TC Kimlik Numarası");
        persCombo.addItem("Personel Telefon Numarası");
        persCombo.addItem("Personel Mail adresi");
        persCombo.addItem("Personel Adresi");
        persCombo.addItem("Personel Maaşı");
        persCombo.addItem("Personel Kurum Numarası");

        stuCombo.addItem("Öğrenci Numarası");
        stuCombo.addItem("Öğrenci Adı");
        stuCombo.addItem("Öğrenci Soyadı");
        stuCombo.addItem("Öğrenci Doğum Tarihi");
        stuCombo.addItem("Öğrenci Mail Adresi");
        stuCombo.addItem("Öğrenci Telefon Numarası");
        stuCombo.addItem("Öğrenci Sınıfı");
        stuCombo.addItem("Öğrenci Adresi");
        stuCombo.addItem("Öğrenci Mezunluk Durumu");
        stuCombo.addItem("Öğrenci Kurum Numarası");
        stuCombo.addItem("Öğrenci TC Kimlik Numarası");

        dersCombo.addItem("Ders Kodu");
        dersCombo.addItem("Ders Adı");
        dersCombo.addItem("Öğrenci Okul Numarası");
        dersCombo.addItem("Öğretmen Id");
        dersCombo.addItem("Tüm Bilgilerle Ders Kodu");

        giderCombo.addItem("Gider Numarası");
        giderCombo.addItem("Gider Adı");
        giderCombo.addItem("Gider Tutarı");
        giderCombo.addItem("Gider Kurum Numarası");
        giderCombo.addItem("Gider Tarihi");

        stokCombo.addItem("Stok");
        stokCombo.addItem("Stok Numarası");
        stokCombo.addItem("Stok Türü");
        stokCombo.addItem("Stok Miktarı");
        stokCombo.addItem("Stok Kurum Numarası");
        stokCombo.addItem("Stok Ders Kodu");

        //Umarım bitmiş personel sekmesi
        personelBilgisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeAllBut(1);

                persAtt.setVisible(!persAtt.isVisible());
                //persAttButton.setVisible(!persAttButton.isVisible());
                persCombo.setVisible(!persCombo.isVisible());

                persCombo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = persCombo.getSelectedItem().toString();
                        String yeniBilgi = selectedOption + " giriniz.";
                        personelLabel.setText(yeniBilgi);


                    }
                });

                button1.setVisible(!button1.isVisible());
                PersonelAtt.setVisible(!PersonelAtt.isVisible());
                personelLabel.setVisible(!personelLabel.isVisible());

                try {
                    PersonelDAO pdao = new PersonelDAO();
                    List<Personel> list = pdao.getAllPersonel();
                    //Make a table for list
                    PersonelTableModel model = new PersonelTableModel(list);
                    table1.setModel(model);

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                }

                //call data for current selection on the drop down menu

                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredText = PersonelAtt.getText();
                        String yeniBilgi = enteredText + " için veritabanı bilgisi burada!";
                        gelenBilgiLabel.setText(yeniBilgi);

                        try {
                            PersonelDAO pdao = new PersonelDAO();
                            String col = "";
                            System.out.println(persCombo.getSelectedIndex());
                            switch (persCombo.getSelectedIndex()) {
                                case 0:
                                    col = "personel_id";
                                    break;
                                case 1:
                                    col = "ad";
                                    break;
                                case 2:
                                    col = "soyad";
                                    break;
                                case 3:
                                    col = "tc_kimlik";
                                    break;
                                case 4:
                                    col = "tel_no";
                                    break;
                                case 5:
                                    col = "mail";
                                    break;
                                case 6:
                                    col = "adres";
                                    break;
                                case 7:
                                    col = "maaş";
                                    break;
                                case 8:
                                    col = "kurum_id";
                                    break;
                                default:
                                    col = "ad";
                                    break;
                            }
                            System.out.println(col);
                            System.out.println(enteredText);
                            List<Personel> list = pdao.searchForPersonel(col, enteredText);
                            //Make a table for list
                            PersonelTableModel model = new PersonelTableModel(list);
                            table1.setModel(model);

                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

            }
        });
        //Bitmiş öğrenci sekmesi
        öğrenciBilgisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeAllBut(2);
                stuAtt.setVisible(!stuAtt.isVisible());
                //stuAttButton.setVisible(!stuAttButton.isVisible());
                stuCombo.setVisible(!stuCombo.isVisible());

                stuCombo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = stuCombo.getSelectedItem().toString();
                        String yeniBilgi = selectedOption + " giriniz.";
                        studentLabel.setText(yeniBilgi);


                    }
                });

                button2.setVisible(!button2.isVisible());
                StudentAtt.setVisible(!StudentAtt.isVisible());
                studentLabel.setVisible(!studentLabel.isVisible());

                try {
                    OgrenciDAO odao = new OgrenciDAO();
                    List<Ogrenci> list = odao.getAllOgrenci();
                    //Make a table for list
                    OgrenciTableModel model = new OgrenciTableModel(list);
                    table1.setModel(model);

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                }

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredText = StudentAtt.getText();
                        String yeniBilgi = enteredText + " için veritabanı bilgisi burada!";
                        gelenBilgiLabel.setText(yeniBilgi);

                        try {
                            OgrenciDAO odao = new OgrenciDAO();
                            String col = "";
                            System.out.println(stuCombo.getSelectedIndex());
                            switch (stuCombo.getSelectedIndex()) {
                                case 0:
                                    col = "okul_no";
                                    break;
                                case 1:
                                    col = "ad";
                                    break;
                                case 2:
                                    col = "soyad";
                                    break;
                                case 3:
                                    col = "doğum_tarihi";
                                    break;
                                case 4:
                                    col = "mail";
                                    break;
                                case 5:
                                    col = "tel_no";
                                    break;
                                case 6:
                                    col = "sınıf";
                                    break;
                                case 7:
                                    col = "adres";
                                    break;
                                case 8:
                                    col = "mezun_mu";
                                    break;
                                case 9:
                                    col = "kurum_id";
                                    break;
                                case 10:
                                    col = "tc_kimlik";
                                    break;
                                default:
                                    col = "ad";
                                    break;
                            }
                            System.out.println(col);
                            System.out.println(enteredText);
                            List<Ogrenci> list = odao.searchForOgrenci(col, enteredText);
                            //Make a table for list
                            OgrenciTableModel model = new OgrenciTableModel(list);
                            table1.setModel(model);

                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });
            }
        });

        dersBilgisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeAllBut(3);
                dersAtt.setVisible(!dersAtt.isVisible());
                //dersAttButton.setVisible(!dersAttButton.isVisible());
                dersCombo.setVisible(!dersCombo.isVisible());

                String selectedOption = dersCombo.getSelectedItem().toString();
                String yeniBilgi = selectedOption + " giriniz.";
                dersLabel.setText(yeniBilgi);

                dersCombo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = "";

                        switch (dersCombo.getSelectedIndex()) {
                            case 4:
                                selectedOption = "Ders Kodu";
                                break;
                            default:
                                selectedOption = dersCombo.getSelectedItem().toString();
                                break;
                        }
                        String yeniBilgi = selectedOption + " giriniz.";
                        dersLabel.setText(yeniBilgi);


                    }
                });

                dersEkleButton.setVisible(!dersEkleButton.isVisible());
                button3.setVisible(!button3.isVisible());
                DersAtt.setVisible(!DersAtt.isVisible());
                dersLabel.setVisible(!dersLabel.isVisible());

                try {
                    DersDAO ddao = new DersDAO();
                    List<Ders> liste = ddao.getAllDers();
                    //Make a table for list
                    DersTableModel model = new DersTableModel(liste);
                    table1.setModel(model);

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                }

                dersEkleButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        DersDAO dersDAO = null;
                        try {
                            dersDAO = new DersDAO();
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                        AddDers dialog = new AddDers(Form1.this, dersDAO);
                        dialog.setVisible(true);

                    }
                });

                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredText = DersAtt.getText();
                        String yeniBilgi = enteredText + " için veritabanı bilgisi burada!";
                        gelenBilgiLabel.setText(yeniBilgi);

                        try {
                            DersDAO ddao = new DersDAO();
                            OgretmenDAO ogretmenDAO = new OgretmenDAO();
                            OgrenciDAO ogrenciDAO = new OgrenciDAO();
                            String col = "";
                            //System.out.println(dersCombo.getSelectedIndex());

                            List<Ders> list = null;
                            List<Dersler> dersler = null;
                            List<DersKoduTumBilgiler> ders = null;
                            switch (dersCombo.getSelectedIndex()) {
                                case 0:
                                    col = "ders_kodu";
                                    list = ddao.searchForDers(col, enteredText);
                                    break;
                                case 1:
                                    col = "ders_adı";
                                    list = ddao.searchForDers(col, enteredText);
                                    break;
                                case 2:
                                    col = "okul_no";
                                    dersler = ogrenciDAO.getDersler(enteredText);
                                    break;
                                case 3:
                                    col = "personel_id";
                                    dersler = ogretmenDAO.getDersler(enteredText);
                                    break;
                                case 4:
                                    ders = ddao.searchForDersAllAttrb(enteredText);
                                    break;
                                default:
                                    col = "ders_kodu";
                                    break;
                            }
                            //System.out.println(col);
                            //System.out.println(enteredText);
                            //List<Ders> list = ddao.searchForDers(col,enteredText);
                            //Make a table for list

                            if (list != null) {
                                DersTableModel model = new DersTableModel(list);
                                table1.setModel(model);
                            } else if (dersler != null) {
                                OgrDersTableModel model1 = new OgrDersTableModel(dersler);
                                table1.setModel(model1);
                            } else if (ders != null) {
                                DersTumTableModel model1 = new DersTumTableModel(ders);
                                table1.setModel(model1);
                            }

                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

            }
        });

        giderBilgisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeAllBut(4);
                giderAtt.setVisible(!giderAtt.isVisible());
                //giderAttButton.setVisible(!giderAttButton.isVisible());
                giderCombo.setVisible(!giderCombo.isVisible());

                giderCombo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = giderCombo.getSelectedItem().toString();
                        String yeniBilgi = selectedOption + " giriniz.";
                        giderLabel.setText(yeniBilgi);


                    }
                });

                button4.setVisible(!button4.isVisible());
                GiderAtt.setVisible(!GiderAtt.isVisible());
                giderLabel.setVisible(!giderLabel.isVisible());


                try {
                    KurumGiderleriDAO kdao = new KurumGiderleriDAO();
                    List<KurumGiderleri> list = kdao.getAllKurumGiderleri();
                    //Make a table for list
                    GiderTableModel model = new GiderTableModel(list);
                    table1.setModel(model);

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                }

                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredText = GiderAtt.getText();
                        String yeniBilgi = enteredText + " için veritabanı bilgisi burada!";
                        gelenBilgiLabel.setText(yeniBilgi);

                        try {
                            KurumGiderleriDAO kdao = new KurumGiderleriDAO();
                            String col = "";
                            System.out.println(giderCombo.getSelectedIndex());
                            switch (giderCombo.getSelectedIndex()) {
                                case 0:
                                    col = "gider_id";
                                    break;
                                case 1:
                                    col = "gider";
                                    break;
                                case 2:
                                    col = "tutar";
                                    break;
                                case 3:
                                    col = "kurum_id";
                                    break;
                                case 9:
                                    col = "tarih";
                                    break;
                                default:
                                    col = "gider";
                                    break;
                            }
                            System.out.println(col);
                            System.out.println(enteredText);
                            List<KurumGiderleri> list = kdao.searchForGider(col, enteredText);
                            //Make a table for list
                            GiderTableModel model = new GiderTableModel(list);
                            table1.setModel(model);

                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

            }
        });

        stokBilgisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeAllBut(5);
                stokAtt.setVisible(!stokAtt.isVisible());
                //stokAttButton.setVisible(!stokAttButton.isVisible());
                stokCombo.setVisible(!stokCombo.isVisible());

                stokCombo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = stokCombo.getSelectedItem().toString();
                        String yeniBilgi = selectedOption + " giriniz.";
                        stokLabel.setText(yeniBilgi);
                        try {
                            switch (stokCombo.getSelectedIndex()) {
                                case 5:
                                    StokDAO sdao = new StokDAO();
                                    List<DersStok> list = sdao.getAllDersStok();
                                    DersStokTableModel model = new DersStokTableModel(list);
                                    table1.setModel(model);
                                    break;
                            }
                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }


                    }
                });

                button5.setVisible(!button5.isVisible());
                StokAtt.setVisible(!StokAtt.isVisible());
                stokLabel.setVisible(!stokLabel.isVisible());

                try {
                    StokDAO sdao = new StokDAO();
                    List<StokWithErr> list = sdao.getAllStokWithErr();
                    //Make a table for list
                    StokWithErrTableModel model = new StokWithErrTableModel(list);
                    table1.setModel(model);

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                }

                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String enteredText = StokAtt.getText();
                        String yeniBilgi = enteredText + " için veritabanı bilgisi burada!";
                        gelenBilgiLabel.setText(yeniBilgi);

                        List<Stok> list = null;
                        List<DersStok> list1 = null;
                        List<StokWithErr> list2 = null;

                        try {
                            StokDAO sdao = new StokDAO();
                            String col = "";
                            System.out.println(stokCombo.getSelectedIndex());
                            switch (stokCombo.getSelectedIndex()) {
                                case 0:
                                    list2 = sdao.getAllStokWithErr();
                                    break;
                                case 1:
                                    col = "stok_id";
                                    list = sdao.searchForStok(col, enteredText);
                                    break;
                                case 2:
                                    col = "stok_türü";
                                    list = sdao.searchForStok(col, enteredText);
                                    break;
                                case 3:
                                    col = "miktar";
                                    list = sdao.searchForStok(col, enteredText);
                                    break;
                                case 4:
                                    col = "kurum_id";
                                    list = sdao.searchForStok(col, enteredText);
                                    break;
                                case 5:
                                    list1 = sdao.searchForDersStok(enteredText);
                                    break;
                                default:
                                    col = "stok_türü";
                                    list = sdao.searchForStok(col, enteredText);
                                    break;
                            }
                            //System.out.println(col);
                            //System.out.println(enteredText);
                            //List<Stok> list = sdao.searchForStok(col, enteredText);
                            //Make a table for list
                            if (list2 != null) {
                                StokWithErrTableModel model = new StokWithErrTableModel(list2);
                                table1.setModel(model);
                            } else if (list != null) {
                                StokTableModel model = new StokTableModel(list);
                                table1.setModel(model);
                            } else if (list1 != null) {
                                DersStokTableModel model = new DersStokTableModel(list1);
                                table1.setModel(model);
                            }


                        } catch (Exception e1) {
                            JOptionPane.showMessageDialog(Form1.this, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

            }
        });

        this.add(panel1);
        this.setVisible(true);

    }

    private void createUIComponents() {
        gelenBilgiLabel = new JLabel();
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(21, 6, new Insets(0, 0, 0, 0), -1, -1));
        stuAtt = new JLabel();
        stuAtt.setText("Aradığınız Öğrenci Özelliğini Seçin:");
        panel1.add(stuAtt, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        dersAtt = new JLabel();
        dersAtt.setText("Aradığınız Ders Özelliğini Seçin:");
        panel1.add(dersAtt, new com.intellij.uiDesigner.core.GridConstraints(9, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        giderAtt = new JLabel();
        giderAtt.setText("Aradığınız Gider Özelliğini Seçin:");
        panel1.add(giderAtt, new com.intellij.uiDesigner.core.GridConstraints(13, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        stuCombo = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        stuCombo.setModel(defaultComboBoxModel1);
        panel1.add(stuCombo, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(83, 30), null, 0, false));
        dersCombo = new JComboBox();
        panel1.add(dersCombo, new com.intellij.uiDesigner.core.GridConstraints(9, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(83, 30), null, 0, false));
        giderCombo = new JComboBox();
        panel1.add(giderCombo, new com.intellij.uiDesigner.core.GridConstraints(13, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(83, 30), null, 0, false));
        stokCombo = new JComboBox();
        panel1.add(stokCombo, new com.intellij.uiDesigner.core.GridConstraints(17, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(83, 30), null, 0, false));
        stokAtt = new JLabel();
        stokAtt.setText("Aradığınız Stok Özelliğini Seçin:");
        panel1.add(stokAtt, new com.intellij.uiDesigner.core.GridConstraints(17, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        gelenBilgiLabel.setHorizontalAlignment(10);
        gelenBilgiLabel.setText("");
        panel1.add(gelenBilgiLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 5, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(237, 16), null, 0, false));
        persAtt = new JLabel();
        persAtt.setHorizontalAlignment(10);
        persAtt.setText("Aradığınız Personel Özelliğini Seçin:");
        panel1.add(persAtt, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        persCombo = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        persCombo.setModel(defaultComboBoxModel2);
        panel1.add(persCombo, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(83, 30), null, 0, false));
        studentLabel = new JLabel();
        studentLabel.setText("Öğrenci Numarasını Giriniz:");
        panel1.add(studentLabel, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        StudentAtt = new JTextField();
        panel1.add(StudentAtt, new com.intellij.uiDesigner.core.GridConstraints(6, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(221, 30), new Dimension(200, -1), 0, false));
        dersLabel = new JLabel();
        dersLabel.setText("Ders Kodunu Giriniz:");
        panel1.add(dersLabel, new com.intellij.uiDesigner.core.GridConstraints(10, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        DersAtt = new JTextField();
        panel1.add(DersAtt, new com.intellij.uiDesigner.core.GridConstraints(10, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(221, 30), new Dimension(200, -1), 0, false));
        öğrenciBilgisiButton = new JButton();
        öğrenciBilgisiButton.setText("Öğrenci Bilgisi");
        panel1.add(öğrenciBilgisiButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(200, 30), new Dimension(200, -1), 0, false));
        dersBilgisiButton = new JButton();
        dersBilgisiButton.setText("Ders Bilgisi");
        panel1.add(dersBilgisiButton, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(200, 30), new Dimension(200, -1), 0, false));
        giderLabel = new JLabel();
        giderLabel.setText("Gider Numarasını Giriniz:");
        panel1.add(giderLabel, new com.intellij.uiDesigner.core.GridConstraints(14, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        GiderAtt = new JTextField();
        panel1.add(GiderAtt, new com.intellij.uiDesigner.core.GridConstraints(14, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(221, 30), new Dimension(200, -1), 0, false));
        button4 = new JButton();
        button4.setText("Seç");
        panel1.add(button4, new com.intellij.uiDesigner.core.GridConstraints(15, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, -1), new Dimension(100, -1), new Dimension(100, -1), 0, false));
        stokLabel = new JLabel();
        stokLabel.setText("Stok Numarasını Giriniz:");
        panel1.add(stokLabel, new com.intellij.uiDesigner.core.GridConstraints(18, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        StokAtt = new JTextField();
        panel1.add(StokAtt, new com.intellij.uiDesigner.core.GridConstraints(18, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(221, 30), new Dimension(200, -1), 0, false));
        button5 = new JButton();
        button5.setText("Seç");
        panel1.add(button5, new com.intellij.uiDesigner.core.GridConstraints(19, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, -1), new Dimension(100, -1), new Dimension(100, -1), 0, false));
        giderBilgisiButton = new JButton();
        giderBilgisiButton.setText("Gider Bilgisi");
        panel1.add(giderBilgisiButton, new com.intellij.uiDesigner.core.GridConstraints(13, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(200, 30), new Dimension(200, -1), 0, false));
        stokBilgisiButton = new JButton();
        stokBilgisiButton.setText("Stok Bilgisi");
        panel1.add(stokBilgisiButton, new com.intellij.uiDesigner.core.GridConstraints(17, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(200, 30), new Dimension(200, -1), 0, false));
        personelLabel = new JLabel();
        personelLabel.setText("Personel Numarasını Giriniz:");
        panel1.add(personelLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 16), null, 0, false));
        PersonelAtt = new JTextField();
        panel1.add(PersonelAtt, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(221, 30), new Dimension(200, -1), 0, false));
        button1 = new JButton();
        button1.setText("Seç");
        panel1.add(button1, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, -1), new Dimension(100, -1), new Dimension(100, -1), 0, false));
        personelBilgisiButton = new JButton();
        personelBilgisiButton.setHideActionText(false);
        personelBilgisiButton.setText("Personel Bilgisi");
        panel1.add(personelBilgisiButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 3, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), new Dimension(200, 30), new Dimension(200, -1), 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(3, 5, 18, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        table1 = new JTable();
        scrollPane1.setViewportView(table1);
        button2 = new JButton();
        button2.setText("Seç");
        panel1.add(button2, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, -1), new Dimension(100, -1), new Dimension(100, -1), 0, false));
        dersEkleButton = new JButton();
        dersEkleButton.setText("Ders Ekle");
        panel1.add(dersEkleButton, new com.intellij.uiDesigner.core.GridConstraints(11, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        button3.setText("Seç");
        panel1.add(button3, new com.intellij.uiDesigner.core.GridConstraints(11, 3, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(100, -1), new Dimension(100, -1), new Dimension(100, -1), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    public void refreshDersView() {
    }

    public static class AddDers extends JDialog {
        private JPanel contentPane;
        private JButton buttonOK;
        private JButton buttonCancel;
        private JTextField DersAdiText;
        private JTextField DersKoduText;
        private JLabel dersAdiLabel;
        private JLabel dersKoduLabel;
        private DersDAO dersDAO;
        private Form1 form1;

        public AddDers(Form1 theform1, DersDAO thedersDAO) {
            this();
            form1 = theform1;
            dersDAO = thedersDAO;
        }

        public AddDers() {
            setContentPane(contentPane);
            setModal(true);
            getRootPane().setDefaultButton(buttonOK);

            buttonOK.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    saveDers();
                }
            });

            buttonCancel.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onCancel();
                }
            });

            // call onCancel() when cross is clicked
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    onCancel();
                }
            });

            // call onCancel() on ESCAPE
            contentPane.registerKeyboardAction(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onCancel();
                }
            }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        }

        protected void saveDers() {
            String dersAdi = DersKoduText.getText();
            String dersKodu = DersAdiText.getText();

            Ders tempDers = new Ders(dersKodu, dersAdi);

            try {
                dersDAO.addDers(tempDers);

                setVisible(false);
                dispose();

                form1.refreshDersView();

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(form1, "Error:" + e1, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private void onCancel() {
            dispose();
        }

        public static void main(String[] args) {
            AddDers dialog = new AddDers();
            dialog.pack();
            dialog.setVisible(true);
            System.exit(0);
        }


        {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
            $$$setupUI$$$();
        }

        /**
         * Method generated by IntelliJ IDEA GUI Designer
         * >>> IMPORTANT!! <<<
         * DO NOT edit this method OR call it in your code!
         *
         * @noinspection ALL
         */
        private void $$$setupUI$$$() {
            contentPane = new JPanel();
            contentPane.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
            final JPanel panel1 = new JPanel();
            panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
            contentPane.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
            final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
            panel1.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
            final JPanel panel2 = new JPanel();
            panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1, true, false));
            panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
            buttonOK = new JButton();
            buttonOK.setText("Ekle");
            panel2.add(buttonOK, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
            buttonCancel = new JButton();
            buttonCancel.setText("İptal");
            panel2.add(buttonCancel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
            final JPanel panel3 = new JPanel();
            panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
            contentPane.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
            dersAdiLabel = new JLabel();
            dersAdiLabel.setText("Ders Kodu");
            panel3.add(dersAdiLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
            DersAdiText = new JTextField();
            panel3.add(DersAdiText, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
            dersKoduLabel = new JLabel();
            dersKoduLabel.setText("Ders Adı");
            panel3.add(dersKoduLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
            DersKoduText = new JTextField();
            panel3.add(DersKoduText, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        }

        /**
         * @noinspection ALL
         */
        public JComponent $$$getRootComponent$$$() {
            return contentPane;
        }
    }
}
