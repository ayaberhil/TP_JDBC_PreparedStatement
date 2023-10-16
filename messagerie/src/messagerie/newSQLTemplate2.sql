ALTER TABLE message
ADD CONSTRAINT FK_Message_Employe_E
FOREIGN KEY (idE) REFERENCES employe(id);
ALTER TABLE message
ADD CONSTRAINT FK_Message_Employe_R
FOREIGN KEY (idR) REFERENCES employe(id);
