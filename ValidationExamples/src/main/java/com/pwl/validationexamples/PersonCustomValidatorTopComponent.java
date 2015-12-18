/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pwl.validationexamples;

import javax.swing.event.ChangeEvent;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.validation.api.Problem;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

@ConvertAsProperties(
        dtd = "-//com.pwl.validationexamples//PersonCustomValidator//EN",
        autostore = false
)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_PersonCustomValidator",
        preferredID = "PersonCustomValidatorTopComponent"
)
@Messages({
    "CTL_PersonCustomValidatorAction=PersonCustomValidator",
    "CTL_PersonCustomValidatorTopComponent=PersonCustomValidator Window",
    "HINT_PersonCustomValidatorTopComponent=This is a PersonCustomValidator window"
})
public final class PersonCustomValidatorTopComponent extends TopComponent {

    private static final long serialVersionUID = 1L;

    public PersonCustomValidatorTopComponent() {
        initComponents();
//        setName(Bundle.CTL_PersonCustomValidatorTopComponent());
//        setToolTipText(Bundle.HINT_PersonCustomValidatorTopComponent());

        nameTextField.setName("Name");
        surnameTextField.setName("Surname");
        //test
        //we have one validation panel
        ValidationGroup validationGroup = validationPanel.getValidationGroup();

        //add components to validation group, validation panel will generate default message, 
        //you may see "null may not be empty" if dont set component name
        validationGroup.add(nameTextField, StringValidators.REQUIRE_NON_EMPTY_STRING);
        validationGroup.add(surnameTextField, StringValidators.REQUIRE_NON_EMPTY_STRING);

        validationPanel.addChangeListener((ChangeEvent e) -> {
            Problem problem = validationPanel.getProblem();
            okButton.setEnabled(problem == null);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        surnameTextField = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        resultText = new javax.swing.JLabel();

        nameTextField.setText(org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonOneValidationTopComponent.Name Field.text")); // NOI18N
        nameTextField.setName("Name Field"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonCustomValidatorTopComponent.nameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(okButton, org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonCustomValidatorTopComponent.okButton.text")); // NOI18N
        okButton.setEnabled(false);

        surnameTextField.setText(org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonCustomValidatorTopComponent.surnameTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(surnameLabel, org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonCustomValidatorTopComponent.surnameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(resultText, org.openide.util.NbBundle.getMessage(PersonCustomValidatorTopComponent.class, "PersonCustomValidatorTopComponent.resultText.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel)
                            .addComponent(surnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(surnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(nameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(resultText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(okButton))
                            .addComponent(validationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameTextField, surnameTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nameTextField, surnameTextField});

    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel resultText;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameTextField;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
