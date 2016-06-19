
package fr.s2re.assembleur;

import java.util.ArrayList;
import java.util.List;

import fr.s2re.dto.AdministrateurDto;
import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.AlerteCommentaireDto;
import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.AlerteMessageDto;
import fr.s2re.dto.AlerteProduitDto;
import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.CiviliteDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CodeReductionDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.CouleurDto;
import fr.s2re.dto.DonDto;
import fr.s2re.dto.EnvieDto;
import fr.s2re.dto.EtatCommandeDto;
import fr.s2re.dto.EtatProduitDto;
import fr.s2re.dto.GerantDto;
import fr.s2re.dto.ImageDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.MarqueDto;
import fr.s2re.dto.MessageDto;
import fr.s2re.dto.MessageForumDto;
import fr.s2re.dto.MessageInboxDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.dto.MethodeLivraisonDto;
import fr.s2re.dto.ModerateurDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ObjetAlerteDto;
import fr.s2re.dto.ProduitCodeReductionDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.dto.RetourDto;
import fr.s2re.dto.RibDto;
import fr.s2re.dto.RubriqueDto;
import fr.s2re.dto.SujetDto;
import fr.s2re.dto.TypeCBDto;
import fr.s2re.dto.TypeReductionDto;
import fr.s2re.dto.TypeRetourDto;
import fr.s2re.dto.TypeSujetDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.dto.VilleDto;
import fr.s2re.entity.Administrateur;
import fr.s2re.entity.Adresse;
import fr.s2re.entity.Alerte;
import fr.s2re.entity.AlerteCommentaire;
import fr.s2re.entity.AlerteMessage;
import fr.s2re.entity.AlerteProduit;
import fr.s2re.entity.Association;
import fr.s2re.entity.CartePaiement;
import fr.s2re.entity.Categorie;
import fr.s2re.entity.Civilite;
import fr.s2re.entity.Client;
import fr.s2re.entity.CodeReduction;
import fr.s2re.entity.Commande;
import fr.s2re.entity.Couleur;
import fr.s2re.entity.Don;
import fr.s2re.entity.Envie;
import fr.s2re.entity.EtatCommande;
import fr.s2re.entity.EtatProduit;
import fr.s2re.entity.Gerant;
import fr.s2re.entity.Image;
import fr.s2re.entity.LigneDeCommande;
import fr.s2re.entity.Marque;
import fr.s2re.entity.Message;
import fr.s2re.entity.MessageForum;
import fr.s2re.entity.MessageInbox;
import fr.s2re.entity.Messagerie;
import fr.s2re.entity.MethodeLivraison;
import fr.s2re.entity.Moderateur;
import fr.s2re.entity.Note;
import fr.s2re.entity.NoteClient;
import fr.s2re.entity.NoteProduit;
import fr.s2re.entity.ObjetAlerte;
import fr.s2re.entity.Produit;
import fr.s2re.entity.ProduitCodeReduction;
import fr.s2re.entity.Retour;
import fr.s2re.entity.Rib;
import fr.s2re.entity.Rubrique;
import fr.s2re.entity.Sujet;
import fr.s2re.entity.TypeCB;
import fr.s2re.entity.TypeReduction;
import fr.s2re.entity.TypeRetour;
import fr.s2re.entity.TypeSujet;
import fr.s2re.entity.Utilisateur;
import fr.s2re.entity.Ville;

public class AssembleurDto {

    /**
     * Constructeur privé.
     */
    private AssembleurDto() {
    }

    public static AdministrateurDto adminDtoFromAdmin(Administrateur paramAdmin) {
        AdministrateurDto adminDto = new AdministrateurDto();
        if (paramAdmin.getCivilite() != null) {
            adminDto.setCivilite(civiliteDtoFromCivilite(paramAdmin.getCivilite()));
        }
        if (paramAdmin.getDateInscription() != null) {
            adminDto.setDateInscription(paramAdmin.getDateInscription());
        }
        adminDto.setId(paramAdmin.getId());
        adminDto.setMail(paramAdmin.getMail());
        adminDto.setNom(paramAdmin.getNom());
        adminDto.setPassword(paramAdmin.getPassword());
        if (paramAdmin.getPrenom() != null) {
            adminDto.setPrenom(paramAdmin.getPrenom());
        }
        adminDto.setTelephone(paramAdmin.getTelephone());
        return adminDto;
    }

    public static AdresseDto adresseDtoFromAdresse(Adresse paramAdresse) {
        AdresseDto adresseDto = new AdresseDto();
        adresseDto.setId(paramAdresse.getId());
        if (paramAdresse.getLibelle() != null) {
            adresseDto.setLibelle(paramAdresse.getLibelle());
        }
        adresseDto.setNumero(paramAdresse.getNumero());
        adresseDto.setRue(paramAdresse.getRue());
        adresseDto.setType(paramAdresse.getType());
        adresseDto.setPublie(paramAdresse.getPublie());
        if (paramAdresse.getClient() != null) {
            adresseDto.setClient(clientDtoFromClient(paramAdresse.getClient()));
        }
        adresseDto.setVille(villeDtoFromVille(paramAdresse.getVille()));
        if (paramAdresse.getLatitude() != null) {
            adresseDto.setLatitude(paramAdresse.getLatitude());
        }
        if (paramAdresse.getLongitude() != null) {
            adresseDto.setLongitude(paramAdresse.getLongitude());
        }
        return adresseDto;
    }

    public static AlerteCommentaireDto alertComDtoFromAlertCom(AlerteCommentaire paramAlerteCom) {
        AlerteCommentaireDto alertComDto = new AlerteCommentaireDto();
        alertComDto.setId(paramAlerteCom.getId());
        alertComDto.setDateCreation(paramAlerteCom.getDateCreation());
        if (paramAlerteCom.getDateCloture() != null) {
            alertComDto.setDateCloture(paramAlerteCom.getDateCloture());
        }
        alertComDto.setObjet(objetAlertDtoFromObjetAlert(paramAlerteCom.getObjet()));
        alertComDto.setEmetteur(userDtoFromUser(paramAlerteCom.getEmetteur()));
        if (paramAlerteCom.getNote() != null) {
            alertComDto.setNote(noteDtoFromNote(paramAlerteCom.getNote()));
        }
        return alertComDto;
    }

    public static AlerteDto alertDtoFromAlert(Alerte paramAlerte) {
        if (paramAlerte.getClass() == AlerteCommentaire.class) {
            return alertComDtoFromAlertCom((AlerteCommentaire) paramAlerte);
        } else if (paramAlerte.getClass() == AlerteMessage.class) {
            return alertMsgDtoFromAlertMsg((AlerteMessage) paramAlerte);
        } else if (paramAlerte.getClass() == AlerteProduit.class) {
            return alertPdtDtoFromAlertPdt((AlerteProduit) paramAlerte);
        } else {
            AlerteDto alerteDto = new AlerteDto();
            alerteDto.setId(paramAlerte.getId());
            alerteDto.setDateCreation(paramAlerte.getDateCreation());
            if (paramAlerte.getDateCloture() != null) {
                alerteDto.setDateCloture(paramAlerte.getDateCloture());
            }
            alerteDto.setEmetteur(userDtoFromUser(paramAlerte.getEmetteur()));
            alerteDto.setObjet(objetAlertDtoFromObjetAlert(paramAlerte.getObjet()));
            return alerteDto;
        }
    }

    public static AlerteMessageDto alertMsgDtoFromAlertMsg(AlerteMessage paramAlertMsg) {
        AlerteMessageDto alerteMsgDto = new AlerteMessageDto();
        alerteMsgDto.setId(paramAlertMsg.getId());
        alerteMsgDto.setDateCreation(paramAlertMsg.getDateCreation());
        if (paramAlertMsg.getDateCloture() != null) {
            alerteMsgDto.setDateCloture(paramAlertMsg.getDateCloture());
        }
        alerteMsgDto.setEmetteur(userDtoFromUser(paramAlertMsg.getEmetteur()));
        alerteMsgDto.setObjet(objetAlertDtoFromObjetAlert(paramAlertMsg.getObjet()));
        return alerteMsgDto;
    }

    public static AlerteProduitDto alertPdtDtoFromAlertPdt(AlerteProduit paramAlertProduit) {
        AlerteProduitDto alertePdtDto = new AlerteProduitDto();
        alertePdtDto.setId(paramAlertProduit.getId());
        alertePdtDto.setDateCreation(paramAlertProduit.getDateCreation());
        if (paramAlertProduit.getDateCloture() != null) {
            alertePdtDto.setDateCloture(paramAlertProduit.getDateCloture());
        }
        alertePdtDto.setEmetteur(userDtoFromUser(paramAlertProduit.getEmetteur()));
        alertePdtDto.setObjet(objetAlertDtoFromObjetAlert(paramAlertProduit.getObjet()));
        return alertePdtDto;
    }

    public static AssociationDto assoDtoFromAsso(Association paramAsso) {
        AssociationDto assocDto = new AssociationDto();
        assocDto.setActif(paramAsso.getActif());
        assocDto.setAdresseLivraison(adresseDtoFromAdresse(paramAsso.getAdresseLivraison()));
        if (paramAsso.getCivilite() != null) {
            assocDto.setCivilite(civiliteDtoFromCivilite(paramAsso.getCivilite()));
        }
        assocDto.setDateInscription(paramAsso.getDateInscription());
        assocDto.setDocument(paramAsso.getDocument());
        assocDto.setId(paramAsso.getId());
        assocDto.setMail(paramAsso.getMail());
        assocDto.setNom(paramAsso.getNom());
        assocDto.setPassword(paramAsso.getPassword());
        if (paramAsso.getPrenom() != null) {
            assocDto.setPrenom(paramAsso.getPrenom());
        }
        assocDto.setTelephone(paramAsso.getTelephone());
        return assocDto;
    }

    public static CartePaiementDto cbDtoFromCb(CartePaiement paramCb) {
        CartePaiementDto cb = new CartePaiementDto();
        cb.setId(paramCb.getId());
        cb.setNumero(paramCb.getNumero());
        cb.setDetenteur(paramCb.getDetenteur());
        cb.setDateExpiration(paramCb.getDateExpiration());
        cb.setPublie(paramCb.getPublie());
        cb.setClient(clientDtoFromClient(paramCb.getClient()));
        cb.setType(typeCBDtoFromTypeCB(paramCb.getType()));
        return cb;
    }

    public static CategorieDto categorieDtoFromCategorie(Categorie paramCategorie) {
        CategorieDto categorieDto = new CategorieDto();
        categorieDto.setId(paramCategorie.getId());
        categorieDto.setLibelle(paramCategorie.getLibelle());
        if (paramCategorie.getCategorieParent() != null) {
            categorieDto.setCategorieParent(categorieDtoFromCategorie(paramCategorie.getCategorieParent()));
        }
        return categorieDto;
    }

    public static CiviliteDto civiliteDtoFromCivilite(Civilite paramCivilite) {
        CiviliteDto civiliteDto = new CiviliteDto();
        civiliteDto.setId(paramCivilite.getId());
        civiliteDto.setLibelle(paramCivilite.getLibelle());
        return civiliteDto;
    }

    public static ClientDto clientDtoFromClient(Client paramClient) {
        ClientDto clientDto = new ClientDto();
        clientDto.setActif(paramClient.getActif());
        if (paramClient.getCivilite() != null) {
            clientDto.setCivilite(civiliteDtoFromCivilite(paramClient.getCivilite()));
        }
        clientDto.setDateInscription(paramClient.getDateInscription());
        clientDto.setId(paramClient.getId());
        clientDto.setMail(paramClient.getMail());
        clientDto.setNom(paramClient.getNom());
        clientDto.setPassword(paramClient.getPassword());
        clientDto.setPrenom(paramClient.getPrenom());
        clientDto.setTelephone(paramClient.getTelephone());
        return clientDto;
    }

    public static CodeReductionDto codeReducDtoFromCodeReduc(CodeReduction paramCodeReduc) {
        CodeReductionDto codeReducDto = new CodeReductionDto();
        codeReducDto.setId(paramCodeReduc.getId());
        codeReducDto.setCode(paramCodeReduc.getCode());
        codeReducDto.setQuantite(paramCodeReduc.getQuantite());
        codeReducDto.setMontant(paramCodeReduc.getMontant());
        codeReducDto.setDateDebut(paramCodeReduc.getDateDebut());
        codeReducDto.setDateFin(paramCodeReduc.getDateFin());
        codeReducDto.setType(typeReducDtoFromTypeReduc(paramCodeReduc.getType()));
        return codeReducDto;
    }

    public static CommandeDto cmdDtoFromCmd(Commande paramCommande) {
        CommandeDto cmdDto = new CommandeDto();
        cmdDto.setId(paramCommande.getId());
        cmdDto.setNumero(paramCommande.getNumero());
        cmdDto.setTotal(paramCommande.getTotal());
        cmdDto.setDate(paramCommande.getDate());
        if (paramCommande.getAdresseFacturation() != null) {
            cmdDto.setAdresseFacturation(adresseDtoFromAdresse(paramCommande.getAdresseFacturation()));
        }
        if (paramCommande.getAdresseLivraison() != null) {
            cmdDto.setAdresseLivraison(adresseDtoFromAdresse(paramCommande.getAdresseLivraison()));
        }
        cmdDto.setClient(clientDtoFromClient(paramCommande.getClient()));
        if (paramCommande.getCodeReduction() != null) {
            cmdDto.setCodeReduction(codeReducDtoFromCodeReduc(paramCommande.getCodeReduction()));
        }
        if (paramCommande.getCommandeParente() != null) {
            cmdDto.setCommandeParente(cmdDtoFromCmd(paramCommande.getCommandeParente()));
        }
        cmdDto.setEtat(etatCmdDtoFromEtatCmd(paramCommande.getEtat()));
        cmdDto.setMethodeLivraison(methodeLivraisonDtoFromMethodeLivraison(paramCommande.getMethodeLivraison()));
        if (paramCommande.getRib() != null) {
            cmdDto.setRib(ribDtoFromRib(paramCommande.getRib()));
        }
        cmdDto.setTypeCB(typeCBDtoFromTypeCB(paramCommande.getTypeCB()));
        return cmdDto;
    }

    public static CouleurDto couleurDtoFromCouleur(Couleur paramCouleur) {
        CouleurDto couleurDto = new CouleurDto();
        couleurDto.setId(paramCouleur.getId());
        couleurDto.setLibelle(paramCouleur.getLibelle());
        return couleurDto;
    }

    public static DonDto donDtoFromDon(Don paramDon) {
        DonDto donDto = new DonDto();
        donDto.setId(paramDon.getId());
        donDto.setQuantite(paramDon.getQuantite());
        donDto.setAssociation(assoDtoFromAsso(paramDon.getAssociation()));
        donDto.setProduit(produitDtoFromProduit(paramDon.getProduit()));
        return donDto;
    }

    public static EnvieDto envieDtoFromEnvie(Envie paramEnvie) {
        EnvieDto envieDto = new EnvieDto();
        envieDto.setId(paramEnvie.getId());
        envieDto.setQuantite(paramEnvie.getQuantite());
        envieDto.setClient(clientDtoFromClient(paramEnvie.getClient()));
        envieDto.setProduit(produitDtoFromProduit(paramEnvie.getProduit()));
        return envieDto;
    }

    public static EtatCommandeDto etatCmdDtoFromEtatCmd(EtatCommande paramEtatCmd) {
        EtatCommandeDto etatCmdDto = new EtatCommandeDto();
        etatCmdDto.setId(paramEtatCmd.getId());
        etatCmdDto.setLibelle(paramEtatCmd.getLibelle());
        return etatCmdDto;
    }

    public static EtatProduitDto etatProduitDtoFromEtatProduit(EtatProduit paramEtatProduit) {
        EtatProduitDto etatProduitDto = new EtatProduitDto();
        etatProduitDto.setId(paramEtatProduit.getId());
        etatProduitDto.setLibelle(paramEtatProduit.getLibelle());
        return etatProduitDto;
    }

    public static GerantDto gerantDtoFromGerant(Gerant paramGerant) {
        GerantDto gerantDto = new GerantDto();
        if (paramGerant.getCivilite() != null) {
            gerantDto.setCivilite(civiliteDtoFromCivilite(paramGerant.getCivilite()));
        }
        if (paramGerant.getDateInscription() != null) {
            gerantDto.setDateInscription(paramGerant.getDateInscription());
        }
        gerantDto.setId(paramGerant.getId());
        gerantDto.setMail(paramGerant.getMail());
        gerantDto.setNom(paramGerant.getNom());
        gerantDto.setPassword(paramGerant.getPassword());
        if (paramGerant.getPrenom() != null) {
            gerantDto.setPrenom(paramGerant.getPrenom());
        }
        gerantDto.setTelephone(paramGerant.getTelephone());
        return gerantDto;
    }

    public static ImageDto imageDtoFromImage(Image paramImage) {
        ImageDto imageDto = new ImageDto();
        imageDto.setId(paramImage.getId());
        imageDto.setUrl(paramImage.getUrl());
        imageDto.setProduit(produitDtoFromProduit(paramImage.getProduit()));
        return imageDto;
    }

    public static LigneDeCommandeDto ligneCmdDtoFromLigneCmd(LigneDeCommande paramLigneCmd) {
        LigneDeCommandeDto ligneDeCmdDto = new LigneDeCommandeDto();
        ligneDeCmdDto.setCommande(cmdDtoFromCmd(paramLigneCmd.getCommande()));
        ligneDeCmdDto.setId(paramLigneCmd.getId());
        ligneDeCmdDto.setProduit(produitDtoFromProduit(paramLigneCmd.getProduit()));
        ligneDeCmdDto.setQuantite(paramLigneCmd.getQuantite());
        return ligneDeCmdDto;
    }

    public static MarqueDto marqueDtoFromMarque(Marque paramMarque) {
        MarqueDto marqueDto = new MarqueDto();
        marqueDto.setId(paramMarque.getId());
        marqueDto.setLibelle(paramMarque.getLibelle());
        return marqueDto;
    }

    public static MessageDto msgDtoFromMsg(Message paramMsg) {
        if (paramMsg.getClass() == MessageForum.class) {
            return msgForumDtoFromMsgForum((MessageForum) paramMsg);
        } else if (paramMsg.getClass() == MessageInbox.class) {
            return msgInboxDtoFromMsgInbox((MessageInbox) paramMsg);
        } else {
            MessageDto msgDto = new MessageDto();
            msgDto.setId(paramMsg.getId());
            msgDto.setMessage(paramMsg.getMessage());
            msgDto.setDate(paramMsg.getDate());
            if (paramMsg.getDateModif() != null) {
                msgDto.setDateModif(paramMsg.getDateModif());
            }
            msgDto.setPublie(paramMsg.getPublie());
            return msgDto;
        }
    }

    public static MessageForumDto msgForumDtoFromMsgForum(MessageForum paramMsgForum) {
        MessageForumDto msgForumDto = new MessageForumDto();
        msgForumDto.setPublie(paramMsgForum.getPublie());
        msgForumDto.setAuteur(userDtoFromUser(paramMsgForum.getAuteur()));
        msgForumDto.setDate(paramMsgForum.getDate());
        if (paramMsgForum.getDateModif() != null) {
            msgForumDto.setDateModif(paramMsgForum.getDateModif());
        }
        msgForumDto.setId(paramMsgForum.getId());
        msgForumDto.setMessage(paramMsgForum.getMessage());
        msgForumDto.setSujet(sujetDtoFromSujet(paramMsgForum.getSujet()));
        return msgForumDto;
    }

    public static MessageInboxDto msgInboxDtoFromMsgInbox(MessageInbox paramMsgInbox) {
        MessageInboxDto msgInboxDto = new MessageInboxDto();
        msgInboxDto.setPublie(paramMsgInbox.getPublie());
        msgInboxDto.setDate(paramMsgInbox.getDate());
        if (paramMsgInbox.getDateModif() != null) {
            msgInboxDto.setDateModif(paramMsgInbox.getDateModif());
        }
        msgInboxDto.setId(paramMsgInbox.getId());
        msgInboxDto.setMessage(paramMsgInbox.getMessage());
        if (paramMsgInbox.getMessagerie() != null) {
            msgInboxDto.setMessagerie(messagerieDtoFromMessagerie(paramMsgInbox.getMessagerie()));
        }
        return msgInboxDto;
    }

    public static MessagerieDto messagerieDtoFromMessagerie(Messagerie paramMessagerie) {
        MessagerieDto msgrieDto = new MessagerieDto();
        msgrieDto.setDemandeur(clientDtoFromClient(paramMessagerie.getDemandeur()));
        msgrieDto.setId(paramMessagerie.getId());
        msgrieDto.setProduit(produitDtoFromProduit(paramMessagerie.getProduit()));
        return msgrieDto;
    }

    public static MethodeLivraisonDto methodeLivraisonDtoFromMethodeLivraison(MethodeLivraison paramMethodeLivraison) {
        MethodeLivraisonDto methodeLivraisonDto = new MethodeLivraisonDto();
        methodeLivraisonDto.setId(paramMethodeLivraison.getId());
        methodeLivraisonDto.setLibelle(paramMethodeLivraison.getLibelle());
        methodeLivraisonDto.setPrix(paramMethodeLivraison.getPrix());
        methodeLivraisonDto.setPublie(paramMethodeLivraison.getPublie());
        return methodeLivraisonDto;
    }

    public static ModerateurDto moderateurDtoFromModerateur(Moderateur paramModerateur) {
        ModerateurDto moderateurDto = new ModerateurDto();
        if (paramModerateur.getCivilite() != null) {
            moderateurDto.setCivilite(civiliteDtoFromCivilite(paramModerateur.getCivilite()));
        }
        if (paramModerateur.getDateInscription() != null) {
            moderateurDto.setDateInscription(paramModerateur.getDateInscription());
        }
        moderateurDto.setId(paramModerateur.getId());
        moderateurDto.setMail(paramModerateur.getMail());
        moderateurDto.setNom(paramModerateur.getNom());
        moderateurDto.setPassword(paramModerateur.getPassword());
        if (paramModerateur.getPrenom() != null) {
            moderateurDto.setPrenom(paramModerateur.getPrenom());
        }
        moderateurDto.setTelephone(paramModerateur.getTelephone());
        return moderateurDto;
    }

    public static NoteClientDto noteClientDtoFromNoteClient(NoteClient paramNoteClient) {
        NoteClientDto noteClientDto = new NoteClientDto();
        noteClientDto.setPublie(paramNoteClient.getPublie());
        noteClientDto.setCommentaire(paramNoteClient.getCommentaire());
        noteClientDto.setDate(paramNoteClient.getDate());
        noteClientDto.setId(paramNoteClient.getId());
        noteClientDto.setNote(paramNoteClient.getNote());
        noteClientDto.setNoteur(clientDtoFromClient(paramNoteClient.getNoteur()));
        noteClientDto.setVendeur(clientDtoFromClient(paramNoteClient.getVendeur()));
        return noteClientDto;
    }

    public static NoteDto noteDtoFromNote(Note paramNote) {
        if (paramNote.getClass() == NoteClient.class) {
            return noteClientDtoFromNoteClient((NoteClient) paramNote);
        } else if (paramNote.getClass() == NoteProduit.class) {
            return noteProduitDtoFromNoteProduit((NoteProduit) paramNote);
        } else {
            NoteDto noteDto = new NoteDto();
            noteDto.setId(paramNote.getId());
            noteDto.setNote(paramNote.getNote());
            noteDto.setCommentaire(paramNote.getCommentaire());
            noteDto.setDate(paramNote.getDate());
            noteDto.setPublie(paramNote.getPublie());
            noteDto.setNoteur(clientDtoFromClient(paramNote.getNoteur()));
            return noteDto;
        }
    }

    public static NoteProduitDto noteProduitDtoFromNoteProduit(NoteProduit paramNoteProduit) {
        NoteProduitDto notePdtDto = new NoteProduitDto();
        notePdtDto.setPublie(paramNoteProduit.getPublie());
        notePdtDto.setCommentaire(paramNoteProduit.getCommentaire());
        notePdtDto.setDate(paramNoteProduit.getDate());
        notePdtDto.setId(paramNoteProduit.getId());
        notePdtDto.setNote(paramNoteProduit.getNote());
        notePdtDto.setNoteur(clientDtoFromClient(paramNoteProduit.getNoteur()));
        notePdtDto.setProduit(produitDtoFromProduit(paramNoteProduit.getProduit()));
        return notePdtDto;
    }

    public static ObjetAlerteDto objetAlertDtoFromObjetAlert(ObjetAlerte paramObjetAlert) {
        ObjetAlerteDto objetAlerteDto = new ObjetAlerteDto();
        objetAlerteDto.setId(paramObjetAlert.getId());
        objetAlerteDto.setLibelle(paramObjetAlert.getLibelle());
        return objetAlerteDto;
    }

    public static ProduitCodeReductionDto pdtCodeReducDtoFromPdtCodeReduc(ProduitCodeReduction paramPdtCodeReduc) {
        ProduitCodeReductionDto pdtCodeReducDto = new ProduitCodeReductionDto();
        pdtCodeReducDto.setId(paramPdtCodeReduc.getId());
        pdtCodeReducDto.setCodeReduction(codeReducDtoFromCodeReduc(paramPdtCodeReduc.getCodeReduction()));
        pdtCodeReducDto.setProduit(produitDtoFromProduit(paramPdtCodeReduc.getProduit()));
        return pdtCodeReducDto;
    }

    public static ProduitDto produitDtoFromProduit(Produit paramProduit) {
        ProduitDto produitDto = new ProduitDto();
        if (paramProduit.getCategorie() != null) {
            produitDto.setCategorie(categorieDtoFromCategorie(paramProduit.getCategorie()));
        }
        if (paramProduit.getCouleur() != null) {
            produitDto.setCouleur(couleurDtoFromCouleur(paramProduit.getCouleur()));
        }
        produitDto.setDescription(paramProduit.getDescription());
        produitDto.setEtat(etatProduitDtoFromEtatProduit(paramProduit.getEtat()));
        produitDto.setId(paramProduit.getId());
        if (paramProduit.getMarque() != null) {
            produitDto.setMarque(marqueDtoFromMarque(paramProduit.getMarque()));
        }
        produitDto.setPrix(paramProduit.getPrix());
        if (paramProduit.getProduitParent() != null) {
            produitDto.setProduitParent(produitDtoFromProduit(paramProduit.getProduitParent()));
        }
        produitDto.setPublie(paramProduit.getPublie());
        produitDto.setQuantite(paramProduit.getQuantite());
        produitDto.setReference(paramProduit.getReference());
        produitDto.setLibelle(paramProduit.getLibelle());
        if (paramProduit.getVendeur() != null) {
            produitDto.setVendeur(clientDtoFromClient(paramProduit.getVendeur()));
        }
        return produitDto;
    }

    public static RetourDto retourDtoFromRetour(Retour paramRetour) {
        RetourDto retourDto = new RetourDto();
        retourDto.setDate(paramRetour.getDate());
        retourDto.setId(paramRetour.getId());
        retourDto.setLigneDeCommande(ligneCmdDtoFromLigneCmd(paramRetour.getLigneDeCommande()));
        retourDto.setNumero(paramRetour.getNumero());
        retourDto.setQuantite(paramRetour.getQuantite());
        retourDto.setRib(ribDtoFromRib(paramRetour.getRib()));
        retourDto.setType(typeRetourDtoFromTypeRetour(paramRetour.getType()));
        return retourDto;
    }

    public static RibDto ribDtoFromRib(Rib paramRib) {
        RibDto ribDto = new RibDto();
        ribDto.setBic(paramRib.getBic());
        ribDto.setCle(paramRib.getCle());
        ribDto.setClient(clientDtoFromClient(paramRib.getClient()));
        ribDto.setCodeBanque(paramRib.getCodeBanque());
        ribDto.setCodeGuichet(paramRib.getCodeGuichet());
        ribDto.setDomiciliation(paramRib.getDomiciliation());
        ribDto.setIban(paramRib.getIban());
        ribDto.setId(paramRib.getId());
        ribDto.setLibelle(paramRib.getLibelle());
        ribDto.setNumeroCompte(paramRib.getNumeroCompte());
        ribDto.setPublie(paramRib.getPublie());
        ribDto.setTitulaire(paramRib.getTitulaire());
        return ribDto;
    }

    public static RubriqueDto rubriqueDtoFromRubrique(Rubrique paramRubrique) {
        RubriqueDto rubriqueDto = new RubriqueDto();
        rubriqueDto.setId(paramRubrique.getId());
        rubriqueDto.setLibelle(paramRubrique.getLibelle());
        if (paramRubrique.getRubriqueParent() != null) {
            rubriqueDto.setRubriqueParent(rubriqueDtoFromRubrique(paramRubrique.getRubriqueParent()));
        }
        return rubriqueDto;
    }

    public static SujetDto sujetDtoFromSujet(Sujet paramSujet) {
        SujetDto sujetDto = new SujetDto();
        sujetDto.setDate(paramSujet.getDate());
        if (paramSujet.getDateCloture() != null) {
            sujetDto.setDateCloture(paramSujet.getDateCloture());
        }
        sujetDto.setId(paramSujet.getId());
        sujetDto.setPublie(paramSujet.getPublie());
        sujetDto.setRubrique(rubriqueDtoFromRubrique(paramSujet.getRubrique()));
        sujetDto.setTitre(paramSujet.getTitre());
        sujetDto.setType(typeSujetDtoFromTypeSujet(paramSujet.getType()));
        return sujetDto;
    }

    public static TypeCBDto typeCBDtoFromTypeCB(TypeCB paramTypeCB) {
        TypeCBDto typeCBDto = new TypeCBDto();
        typeCBDto.setId(paramTypeCB.getId());
        typeCBDto.setLibelle(paramTypeCB.getLibelle());
        typeCBDto.setUrl(paramTypeCB.getUrl());
        return typeCBDto;
    }

    public static TypeReductionDto typeReducDtoFromTypeReduc(TypeReduction paramTypeReduc) {
        TypeReductionDto typeReducDto = new TypeReductionDto();
        typeReducDto.setId(paramTypeReduc.getId());
        typeReducDto.setLibelle(paramTypeReduc.getLibelle());
        return typeReducDto;
    }

    public static TypeRetourDto typeRetourDtoFromTypeRetour(TypeRetour paramTypeRetour) {
        TypeRetourDto typeRetourDto = new TypeRetourDto();
        typeRetourDto.setId(paramTypeRetour.getId());
        typeRetourDto.setLibelle(paramTypeRetour.getLibelle());
        return typeRetourDto;
    }

    public static TypeSujetDto typeSujetDtoFromTypeSujet(TypeSujet paramTypeSujet) {
        TypeSujetDto typeSjtDto = new TypeSujetDto();
        typeSjtDto.setId(paramTypeSujet.getId());
        typeSjtDto.setLibelle(paramTypeSujet.getLibelle());
        return typeSjtDto;
    }

    public static UtilisateurDto userDtoFromUser(Utilisateur paramUser) {
        if (paramUser != null) {
            if (paramUser.getClass() == Client.class) {
                return clientDtoFromClient((Client) paramUser);
            } else if (paramUser.getClass() == Association.class) {
                return assoDtoFromAsso((Association) paramUser);
            } else if (paramUser.getClass() == Moderateur.class) {
                return moderateurDtoFromModerateur((Moderateur) paramUser);
            } else if (paramUser.getClass() == Gerant.class) {
                return gerantDtoFromGerant((Gerant) paramUser);
            } else if (paramUser.getClass() == Administrateur.class) {
                return adminDtoFromAdmin((Administrateur) paramUser);
            } else {
                UtilisateurDto userDto = new UtilisateurDto();
                userDto.setId(paramUser.getId());
                userDto.setNom(paramUser.getNom());
                userDto.setPrenom(paramUser.getPrenom());
                userDto.setMail(paramUser.getMail());
                userDto.setPassword(paramUser.getPassword());
                userDto.setTelephone(paramUser.getTelephone());
                userDto.setDateInscription(paramUser.getDateInscription());
                if (paramUser.getCivilite() != null) {
                    userDto.setCivilite(civiliteDtoFromCivilite(paramUser.getCivilite()));
                }
                return userDto;
            }
        } else {
            return null;
        }

    }

    public static VilleDto villeDtoFromVille(Ville paramVille) {
        VilleDto villeDto = new VilleDto();
        villeDto.setCp(paramVille.getCp());
        villeDto.setId(paramVille.getId());
        villeDto.setNom(paramVille.getNom());
        return villeDto;
    }

    public static Administrateur adminFromAdminDto(AdministrateurDto paramAdminDto) {
        Administrateur admin = new Administrateur();
        if (paramAdminDto.getCivilite() != null) {
            admin.setCivilite(civiliteFromCiviliteDto(paramAdminDto.getCivilite()));
        }
        if (paramAdminDto.getDateInscription() != null) {
            admin.setDateInscription(paramAdminDto.getDateInscription());
        }
        if (paramAdminDto.getId() != null) {
            admin.setId(paramAdminDto.getId());
        }
        admin.setMail(paramAdminDto.getMail());
        admin.setNom(paramAdminDto.getNom());
        admin.setPassword(paramAdminDto.getPassword());
        if (paramAdminDto.getPrenom() != null) {
            admin.setPrenom(paramAdminDto.getPrenom());
        }
        admin.setTelephone(paramAdminDto.getTelephone());
        return admin;
    }

    public static Adresse adresseFromAdresseDto(AdresseDto paramAdresseDto) {
        Adresse adresse = new Adresse();
        if (paramAdresseDto.getId() != null) {
            adresse.setId(paramAdresseDto.getId());
        }
        if (paramAdresseDto.getLibelle() != null) {
            adresse.setLibelle(paramAdresseDto.getLibelle());
        }
        adresse.setNumero(paramAdresseDto.getNumero());
        adresse.setRue(paramAdresseDto.getRue());
        adresse.setType(paramAdresseDto.getType());
        adresse.setPublie(paramAdresseDto.getPublie());
        if (paramAdresseDto.getClient() != null) {
            adresse.setClient(clientFromClientDto(paramAdresseDto.getClient()));
        }
        adresse.setVille(villeFromVilleDto(paramAdresseDto.getVille()));
        if (paramAdresseDto.getLatitude() != null) {
            adresse.setLatitude(paramAdresseDto.getLatitude());
        }
        if (paramAdresseDto.getLongitude() != null) {
            adresse.setLongitude(paramAdresseDto.getLongitude());
        }
        return adresse;
    }

    public static AlerteCommentaire alertComFromAlertComDto(AlerteCommentaireDto paramAlerteComDto) {
        AlerteCommentaire alerteCom = new AlerteCommentaire();
        if (paramAlerteComDto.getId() != null) {
            alerteCom.setId(paramAlerteComDto.getId());
        }
        alerteCom.setDateCreation(paramAlerteComDto.getDateCreation());
        if (paramAlerteComDto.getDateCloture() != null) {
            alerteCom.setDateCloture(paramAlerteComDto.getDateCloture());
        }
        alerteCom.setObjet(objetAlertFromObjetAlertDto(paramAlerteComDto.getObjet()));
        alerteCom.setEmetteur(userFromUserDto(paramAlerteComDto.getEmetteur()));
        if (paramAlerteComDto.getNote() != null) {
            alerteCom.setNote(noteFromNoteDto(paramAlerteComDto.getNote()));
        }
        return alerteCom;
    }

    public static Alerte alertFromAlertDto(AlerteDto paramAlerteDto) {
        if (paramAlerteDto.getClass() == AlerteCommentaireDto.class) {
            return alertComFromAlertComDto((AlerteCommentaireDto) paramAlerteDto);
        } else if (paramAlerteDto.getClass() == AlerteMessageDto.class) {
            return alertMsgFromAlertMsgDto((AlerteMessageDto) paramAlerteDto);
        } else if (paramAlerteDto.getClass() == AlerteProduitDto.class) {
            return alertPdtFromAlertPdtDto((AlerteProduitDto) paramAlerteDto);
        } else {
            Alerte alerte = new Alerte();
            if (paramAlerteDto.getId() != null) {
                alerte.setId(paramAlerteDto.getId());
            }
            alerte.setDateCreation(paramAlerteDto.getDateCreation());
            if (paramAlerteDto.getDateCloture() != null) {
                alerte.setDateCloture(paramAlerteDto.getDateCloture());
            }
            alerte.setEmetteur(userFromUserDto(paramAlerteDto.getEmetteur()));
            alerte.setObjet(objetAlertFromObjetAlertDto(paramAlerteDto.getObjet()));
            return alerte;
        }
    }

    public static AlerteMessage alertMsgFromAlertMsgDto(AlerteMessageDto paramAlertMsgDto) {
        AlerteMessage alerteMsg = new AlerteMessage();
        if (paramAlertMsgDto.getId() != null) {
            alerteMsg.setId(paramAlertMsgDto.getId());
        }
        alerteMsg.setDateCreation(paramAlertMsgDto.getDateCreation());
        if (paramAlertMsgDto.getDateCloture() != null) {
            alerteMsg.setDateCloture(paramAlertMsgDto.getDateCloture());
        }
        alerteMsg.setEmetteur(userFromUserDto(paramAlertMsgDto.getEmetteur()));
        alerteMsg.setObjet(objetAlertFromObjetAlertDto(paramAlertMsgDto.getObjet()));
        return alerteMsg;
    }

    public static AlerteProduit alertPdtFromAlertPdtDto(AlerteProduitDto paramAlertProduitDto) {
        AlerteProduit alertePdt = new AlerteProduit();
        if (paramAlertProduitDto.getId() != null) {
            alertePdt.setId(paramAlertProduitDto.getId());
        }
        alertePdt.setDateCreation(paramAlertProduitDto.getDateCreation());
        if (paramAlertProduitDto.getDateCloture() != null) {
            alertePdt.setDateCloture(paramAlertProduitDto.getDateCloture());
        }
        alertePdt.setEmetteur(userFromUserDto(paramAlertProduitDto.getEmetteur()));
        alertePdt.setObjet(objetAlertFromObjetAlertDto(paramAlertProduitDto.getObjet()));
        return alertePdt;
    }

    public static Association assoFromAssoDto(AssociationDto paramAssoDto) {
        Association association = new Association();
        association.setActif(paramAssoDto.getActif());
        association.setAdresseLivraison(adresseFromAdresseDto(paramAssoDto.getAdresseLivraison()));
        if (paramAssoDto.getCivilite() != null) {
            association.setCivilite(civiliteFromCiviliteDto(paramAssoDto.getCivilite()));
        }
        association.setDateInscription(paramAssoDto.getDateInscription());
        association.setDocument(paramAssoDto.getDocument());
        if (paramAssoDto.getId() != null) {
            association.setId(paramAssoDto.getId());
        }
        association.setMail(paramAssoDto.getMail());
        association.setNom(paramAssoDto.getNom());
        association.setPassword(paramAssoDto.getPassword());
        if (paramAssoDto.getPrenom() != null) {
            association.setPrenom(paramAssoDto.getPrenom());
        }
        association.setTelephone(paramAssoDto.getTelephone());
        return association;
    }

    public static CartePaiement cbFromCbDto(CartePaiementDto paramCbDto) {
        CartePaiement cb = new CartePaiement();
        if (paramCbDto.getId() != null) {
            cb.setId(paramCbDto.getId());
        }
        cb.setNumero(paramCbDto.getNumero());
        cb.setDetenteur(paramCbDto.getDetenteur());
        cb.setDateExpiration(paramCbDto.getDateExpiration());
        cb.setPublie(paramCbDto.getPublie());
        cb.setClient(clientFromClientDto(paramCbDto.getClient()));
        cb.setType(typeCBFromTypeCBDto(paramCbDto.getType()));
        return cb;
    }

    public static Categorie categorieFromCategorieDto(CategorieDto paramCategorieDto) {
        Categorie categorie = new Categorie();
        if (paramCategorieDto.getId() != null) {
            categorie.setId(paramCategorieDto.getId());
        }
        categorie.setLibelle(paramCategorieDto.getLibelle());
        if (paramCategorieDto.getCategorieParent() != null) {
            categorie.setCategorieParent(categorieFromCategorieDto(paramCategorieDto.getCategorieParent()));
        }
        return categorie;
    }

    public static Civilite civiliteFromCiviliteDto(CiviliteDto paramCiviliteDto) {
        Civilite civilite = new Civilite();
        civilite.setId(paramCiviliteDto.getId());
        civilite.setLibelle(paramCiviliteDto.getLibelle());
        return civilite;
    }

    public static Client clientFromClientDto(ClientDto paramClientDto) {
        Client client = new Client();
        client.setActif(paramClientDto.getActif());
        if (paramClientDto.getCivilite() != null) {
            client.setCivilite(civiliteFromCiviliteDto(paramClientDto.getCivilite()));
        }
        client.setDateInscription(paramClientDto.getDateInscription());
        if (paramClientDto.getId() != null) {
            client.setId(paramClientDto.getId());
        }
        client.setMail(paramClientDto.getMail());
        client.setNom(paramClientDto.getNom());
        client.setPassword(paramClientDto.getPassword());
        client.setPrenom(paramClientDto.getPrenom());
        client.setTelephone(paramClientDto.getTelephone());
        return client;
    }

    public static CodeReduction codeReducFromCodeReducDto(CodeReductionDto paramCodeReducDto) {
        CodeReduction codeReduc = new CodeReduction();
        if (paramCodeReducDto.getId() != null) {
            codeReduc.setId(paramCodeReducDto.getId());
        }
        codeReduc.setCode(paramCodeReducDto.getCode());
        codeReduc.setQuantite(paramCodeReducDto.getQuantite());
        codeReduc.setMontant(paramCodeReducDto.getMontant());
        codeReduc.setDateDebut(paramCodeReducDto.getDateDebut());
        codeReduc.setDateFin(paramCodeReducDto.getDateFin());
        codeReduc.setType(typeReducFromTypeReducDto(paramCodeReducDto.getType()));
        return codeReduc;
    }

    public static Commande cmdFromCmdDto(CommandeDto paramCommandeDto) {
        Commande commande = new Commande();
        if (paramCommandeDto.getId() != null) {
            commande.setId(paramCommandeDto.getId());
        }
        commande.setNumero(paramCommandeDto.getNumero());
        commande.setTotal(paramCommandeDto.getTotal());
        commande.setDate(paramCommandeDto.getDate());
        if (paramCommandeDto.getAdresseFacturation() != null) {
            commande.setAdresseFacturation(adresseFromAdresseDto(paramCommandeDto.getAdresseFacturation()));
        }
        if (paramCommandeDto.getAdresseLivraison() != null) {
            commande.setAdresseLivraison(adresseFromAdresseDto(paramCommandeDto.getAdresseLivraison()));
        }
        commande.setClient(clientFromClientDto(paramCommandeDto.getClient()));
        if (paramCommandeDto.getCodeReduction() != null) {
            commande.setCodeReduction(codeReducFromCodeReducDto(paramCommandeDto.getCodeReduction()));
        }
        if (paramCommandeDto.getCommandeParente() != null) {
            commande.setCommandeParente(cmdFromCmdDto(paramCommandeDto.getCommandeParente()));
        }
        commande.setEtat(etatCmdFromEtatCmdDto(paramCommandeDto.getEtat()));
        commande.setMethodeLivraison(methodeLivraisonFromMethodeLivraisonDto(paramCommandeDto.getMethodeLivraison()));
        if (paramCommandeDto.getRib() != null) {
            commande.setRib(ribFromRibDto(paramCommandeDto.getRib()));
        }
        commande.setTypeCB(typeCBFromTypeCBDto(paramCommandeDto.getTypeCB()));
        return commande;
    }

    public static Couleur couleurFromCouleurDto(CouleurDto paramCouleurDto) {
        Couleur couleur = new Couleur();
        couleur.setId(paramCouleurDto.getId());
        couleur.setLibelle(paramCouleurDto.getLibelle());
        return couleur;
    }

    public static Don donFromDonDto(DonDto paramDonDto) {
        Don don = new Don();
        if (paramDonDto.getId() != null) {
            don.setId(paramDonDto.getId());
        }
        don.setQuantite(paramDonDto.getQuantite());
        don.setAssociation(assoFromAssoDto(paramDonDto.getAssociation()));
        don.setProduit(produitFromProduitDto(paramDonDto.getProduit()));
        return don;
    }

    public static Envie envieFromEnvieDto(EnvieDto paramEnvieDto) {
        Envie envie = new Envie();
        if (paramEnvieDto.getId() != null) {
            envie.setId(paramEnvieDto.getId());
        }
        envie.setQuantite(paramEnvieDto.getQuantite());
        envie.setClient(clientFromClientDto(paramEnvieDto.getClient()));
        envie.setProduit(produitFromProduitDto(paramEnvieDto.getProduit()));
        return envie;
    }

    public static EtatCommande etatCmdFromEtatCmdDto(EtatCommandeDto paramEtatCmdDto) {
        EtatCommande etatCmd = new EtatCommande();
        etatCmd.setId(paramEtatCmdDto.getId());
        etatCmd.setLibelle(paramEtatCmdDto.getLibelle());
        return etatCmd;
    }

    public static EtatProduit etatProduitFromEtatProduitDto(EtatProduitDto paramEtatProduitDto) {
        EtatProduit etatPdt = new EtatProduit();
        etatPdt.setId(paramEtatProduitDto.getId());
        etatPdt.setLibelle(paramEtatProduitDto.getLibelle());
        return etatPdt;
    }

    public static Gerant gerantFromGerantDto(GerantDto paramGerantDto) {
        Gerant gerant = new Gerant();
        if (paramGerantDto.getCivilite() != null) {
            gerant.setCivilite(civiliteFromCiviliteDto(paramGerantDto.getCivilite()));
        }
        if (paramGerantDto.getDateInscription() != null) {
            gerant.setDateInscription(paramGerantDto.getDateInscription());
        }
        if (paramGerantDto.getId() != null) {
            gerant.setId(paramGerantDto.getId());
        }
        gerant.setMail(paramGerantDto.getMail());
        gerant.setNom(paramGerantDto.getNom());
        gerant.setPassword(paramGerantDto.getPassword());
        if (paramGerantDto.getPrenom() != null) {
            gerant.setPrenom(paramGerantDto.getPrenom());
        }
        gerant.setTelephone(paramGerantDto.getTelephone());
        return gerant;
    }

    public static Image imageFromImageDto(ImageDto paramImageDto) {
        Image image = new Image();
        if (paramImageDto.getId() != null) {
            image.setId(paramImageDto.getId());
        }
        image.setUrl(paramImageDto.getUrl());
        image.setProduit(produitFromProduitDto(paramImageDto.getProduit()));
        return image;
    }

    public static LigneDeCommande ligneCmdFromLigneCmdDto(LigneDeCommandeDto paramLigneCmdDto) {
        LigneDeCommande ligneDeCmd = new LigneDeCommande();
        if (paramLigneCmdDto.getCommande() != null) {
            ligneDeCmd.setCommande(cmdFromCmdDto(paramLigneCmdDto.getCommande()));
        }
        if (paramLigneCmdDto.getId() != null) {
            ligneDeCmd.setId(paramLigneCmdDto.getId());
        }
        ligneDeCmd.setProduit(produitFromProduitDto(paramLigneCmdDto.getProduit()));
        ligneDeCmd.setQuantite(paramLigneCmdDto.getQuantite());
        return ligneDeCmd;
    }

    public static Marque marqueFromMarqueDto(MarqueDto paramMarqueDto) {
        Marque marque = new Marque();
        marque.setId(paramMarqueDto.getId());
        marque.setLibelle(paramMarqueDto.getLibelle());
        return marque;
    }

    public static Message msgFromMsgDto(MessageDto paramMsgDto) {
        if (paramMsgDto.getClass() == MessageForumDto.class) {
            return msgForumFromMsgForumDto((MessageForumDto) paramMsgDto);
        } else if (paramMsgDto.getClass() == MessageInboxDto.class) {
            return msgInboxFromMsgInboxDto((MessageInboxDto) paramMsgDto);
        } else {
            Message message = new Message();
            if (paramMsgDto.getId() != null) {
                message.setId(paramMsgDto.getId());
            }
            message.setMessage(paramMsgDto.getMessage());
            message.setDate(paramMsgDto.getDate());
            if (paramMsgDto.getDateModif() != null) {
                message.setDateModif(paramMsgDto.getDateModif());
            }
            message.setPublie(paramMsgDto.getPublie());
            return message;
        }
    }

    public static MessageForum msgForumFromMsgForumDto(MessageForumDto paramMsgForumDto) {
        MessageForum msgForum = new MessageForum();
        msgForum.setPublie(paramMsgForumDto.getPublie());
        msgForum.setAuteur(userFromUserDto(paramMsgForumDto.getAuteur()));
        msgForum.setDate(paramMsgForumDto.getDate());
        if (paramMsgForumDto.getDateModif() != null) {
            msgForum.setDateModif(paramMsgForumDto.getDateModif());
        }
        if (paramMsgForumDto.getId() != null) {
            msgForum.setId(paramMsgForumDto.getId());
        }
        msgForum.setMessage(paramMsgForumDto.getMessage());
        msgForum.setSujet(sujetFromSujetDto(paramMsgForumDto.getSujet()));
        return msgForum;
    }

    public static MessageInbox msgInboxFromMsgInboxDto(MessageInboxDto paramMsgInboxDto) {
        MessageInbox msgInbox = new MessageInbox();
        msgInbox.setPublie(paramMsgInboxDto.getPublie());
        msgInbox.setDate(paramMsgInboxDto.getDate());
        if (paramMsgInboxDto.getDateModif() != null) {
            msgInbox.setDateModif(paramMsgInboxDto.getDateModif());
        }
        if (paramMsgInboxDto.getId() != null) {
            msgInbox.setId(paramMsgInboxDto.getId());
        }
        msgInbox.setMessage(paramMsgInboxDto.getMessage());
        if (paramMsgInboxDto.getMessagerie() != null) {
            msgInbox.setMessagerie(messagerieFromMessagerieDto(paramMsgInboxDto.getMessagerie()));
        }
        return msgInbox;
    }

    public static Messagerie messagerieFromMessagerieDto(MessagerieDto paramMessagerieDto) {
        Messagerie messagerie = new Messagerie();
        messagerie.setDemandeur(clientFromClientDto(paramMessagerieDto.getDemandeur()));
        if (paramMessagerieDto.getId() != null) {
            messagerie.setId(paramMessagerieDto.getId());
        }
        messagerie.setProduit(produitFromProduitDto(paramMessagerieDto.getProduit()));
        return messagerie;
    }

    public static MethodeLivraison methodeLivraisonFromMethodeLivraisonDto(MethodeLivraisonDto paramMethodeLivraisonDto) {
        MethodeLivraison methodeLivraison = new MethodeLivraison();
        methodeLivraison.setId(paramMethodeLivraisonDto.getId());
        methodeLivraison.setLibelle(paramMethodeLivraisonDto.getLibelle());
        methodeLivraison.setPrix(paramMethodeLivraisonDto.getPrix());
        methodeLivraison.setPublie(paramMethodeLivraisonDto.getPublie());
        return methodeLivraison;
    }

    public static Moderateur moderateurFromModerateurDto(ModerateurDto paramModerateurDto) {
        Moderateur moderateur = new Moderateur();
        if (paramModerateurDto.getCivilite() != null) {
            moderateur.setCivilite(civiliteFromCiviliteDto(paramModerateurDto.getCivilite()));
        }
        if (paramModerateurDto.getDateInscription() != null) {
            moderateur.setDateInscription(paramModerateurDto.getDateInscription());
        }
        if (paramModerateurDto.getId() != null) {
            moderateur.setId(paramModerateurDto.getId());
        }
        moderateur.setMail(paramModerateurDto.getMail());
        moderateur.setNom(paramModerateurDto.getNom());
        moderateur.setPassword(paramModerateurDto.getPassword());
        if (paramModerateurDto.getPrenom() != null) {
            moderateur.setPrenom(paramModerateurDto.getPrenom());
        }
        moderateur.setTelephone(paramModerateurDto.getTelephone());
        return moderateur;
    }

    public static NoteClient noteClientFromNoteClientDto(NoteClientDto paramNoteClientDto) {
        NoteClient noteClient = new NoteClient();
        if (paramNoteClientDto.getId() != null) {
            noteClient.setId(paramNoteClientDto.getId());
        }
        noteClient.setPublie(paramNoteClientDto.getPublie());
        noteClient.setCommentaire(paramNoteClientDto.getCommentaire());
        noteClient.setDate(paramNoteClientDto.getDate());
        noteClient.setNote(paramNoteClientDto.getNote());
        noteClient.setNoteur(clientFromClientDto(paramNoteClientDto.getNoteur()));
        noteClient.setVendeur(clientFromClientDto(paramNoteClientDto.getVendeur()));
        return noteClient;
    }

    public static Note noteFromNoteDto(NoteDto paramNoteDto) {
        if (paramNoteDto.getClass() == NoteClientDto.class) {
            return noteClientFromNoteClientDto((NoteClientDto) paramNoteDto);
        } else if (paramNoteDto.getClass() == NoteProduitDto.class) {
            return noteProduitFromNoteProduitDto((NoteProduitDto) paramNoteDto);
        } else {
            Note note = new Note();
            note.setPublie(paramNoteDto.getPublie());
            note.setCommentaire(paramNoteDto.getCommentaire());
            note.setDate(paramNoteDto.getDate());
            if (paramNoteDto.getId() != null) {
                note.setId(paramNoteDto.getId());
            }
            note.setNote(paramNoteDto.getNote());
            note.setNoteur(clientFromClientDto(paramNoteDto.getNoteur()));
            return note;
        }
    }

    public static NoteProduit noteProduitFromNoteProduitDto(NoteProduitDto paramNoteProduitDto) {
        NoteProduit notePdt = new NoteProduit();
        notePdt.setPublie(paramNoteProduitDto.getPublie());
        notePdt.setCommentaire(paramNoteProduitDto.getCommentaire());
        notePdt.setDate(paramNoteProduitDto.getDate());
        if (paramNoteProduitDto != null) {
            notePdt.setId(paramNoteProduitDto.getId());
        }
        notePdt.setNote(paramNoteProduitDto.getNote());
        notePdt.setNoteur(clientFromClientDto(paramNoteProduitDto.getNoteur()));
        notePdt.setProduit(produitFromProduitDto(paramNoteProduitDto.getProduit()));
        return notePdt;
    }

    public static ObjetAlerte objetAlertFromObjetAlertDto(ObjetAlerteDto paramObjetAlertDto) {
        ObjetAlerte objetAlerte = new ObjetAlerte();
        objetAlerte.setId(paramObjetAlertDto.getId());
        objetAlerte.setLibelle(paramObjetAlertDto.getLibelle());
        return objetAlerte;
    }

    public static ProduitCodeReduction pdtCodeReducFromPdtCodeReducDto(ProduitCodeReductionDto paramPdtCodeReducDto) {
        ProduitCodeReduction pdtCodeReduc = new ProduitCodeReduction();
        pdtCodeReduc.setId(paramPdtCodeReducDto.getId());
        pdtCodeReduc.setCodeReduction(codeReducFromCodeReducDto(paramPdtCodeReducDto.getCodeReduction()));
        pdtCodeReduc.setProduit(produitFromProduitDto(paramPdtCodeReducDto.getProduit()));
        return pdtCodeReduc;
    }

    public static Produit produitFromProduitDto(ProduitDto paramProduitDto) {
        Produit produit = new Produit();
        if (paramProduitDto.getCategorie() != null) {
            produit.setCategorie(categorieFromCategorieDto(paramProduitDto.getCategorie()));
        }
        produit.setCouleur(couleurFromCouleurDto(paramProduitDto.getCouleur()));
        produit.setDescription(paramProduitDto.getDescription());
        produit.setEtat(etatProduitFromEtatProduitDto(paramProduitDto.getEtat()));
        if (paramProduitDto.getId() != null) {
            produit.setId(paramProduitDto.getId());
        }
        produit.setMarque(marqueFromMarqueDto(paramProduitDto.getMarque()));
        produit.setPrix(paramProduitDto.getPrix());
        if (paramProduitDto.getProduitParent() != null) {
            produit.setProduitParent(produitFromProduitDto(paramProduitDto.getProduitParent()));
        }
        produit.setPublie(paramProduitDto.getPublie());
        produit.setQuantite(paramProduitDto.getQuantite());
        produit.setReference(paramProduitDto.getReference());
        produit.setLibelle(paramProduitDto.getLibelle());
        if (paramProduitDto.getVendeur() != null) {
            produit.setVendeur(clientFromClientDto(paramProduitDto.getVendeur()));
        }
        return produit;
    }

    public static Retour retourFromRetourDto(RetourDto paramRetourDto) {
        Retour retour = new Retour();
        retour.setDate(paramRetourDto.getDate());
        if (paramRetourDto.getId() != null) {
            retour.setId(paramRetourDto.getId());
        }
        retour.setLigneDeCommande(ligneCmdFromLigneCmdDto(paramRetourDto.getLigneDeCommande()));
        retour.setNumero(paramRetourDto.getNumero());
        retour.setQuantite(paramRetourDto.getQuantite());
        retour.setRib(ribFromRibDto(paramRetourDto.getRib()));
        retour.setType(typeRetourFromTypeRetourDto(paramRetourDto.getType()));
        return retour;
    }

    public static Rib ribFromRibDto(RibDto paramRibDto) {
        Rib rib = new Rib();
        rib.setBic(paramRibDto.getBic());
        rib.setCle(paramRibDto.getCle());
        rib.setClient(clientFromClientDto(paramRibDto.getClient()));
        rib.setCodeBanque(paramRibDto.getCodeBanque());
        rib.setCodeGuichet(paramRibDto.getCodeGuichet());
        rib.setDomiciliation(paramRibDto.getDomiciliation());
        rib.setIban(paramRibDto.getIban());
        if (paramRibDto.getId() != null) {
            rib.setId(paramRibDto.getId());
        }
        rib.setLibelle(paramRibDto.getLibelle());
        rib.setNumeroCompte(paramRibDto.getNumeroCompte());
        rib.setPublie(paramRibDto.getPublie());
        rib.setTitulaire(paramRibDto.getTitulaire());
        return rib;
    }

    public static Rubrique rubriqueFromRubriqueDto(RubriqueDto paramRubriqueDto) {
        Rubrique rubrique = new Rubrique();
        rubrique.setId(paramRubriqueDto.getId());
        rubrique.setLibelle(paramRubriqueDto.getLibelle());
        if (paramRubriqueDto.getRubriqueParent() != null) {
            rubrique.setRubriqueParent(rubriqueFromRubriqueDto(paramRubriqueDto.getRubriqueParent()));
        }
        return rubrique;
    }

    public static Sujet sujetFromSujetDto(SujetDto paramSujetDto) {
        Sujet sujet = new Sujet();
        sujet.setDate(paramSujetDto.getDate());
        if (paramSujetDto.getDateCloture() != null) {
            sujet.setDateCloture(paramSujetDto.getDateCloture());
        }
        if (paramSujetDto.getId() != null) {
            sujet.setId(paramSujetDto.getId());
        }
        sujet.setPublie(paramSujetDto.getPublie());
        sujet.setRubrique(rubriqueFromRubriqueDto(paramSujetDto.getRubrique()));
        sujet.setTitre(paramSujetDto.getTitre());
        sujet.setType(typeSujetFromTypeSujetDto(paramSujetDto.getType()));
        return sujet;
    }

    public static TypeCB typeCBFromTypeCBDto(TypeCBDto paramTypeCBDto) {
        TypeCB typeCB = new TypeCB();
        typeCB.setId(paramTypeCBDto.getId());
        typeCB.setLibelle(paramTypeCBDto.getLibelle());
        typeCB.setUrl(paramTypeCBDto.getUrl());
        return typeCB;
    }

    public static TypeReduction typeReducFromTypeReducDto(TypeReductionDto paramTypeReducDto) {
        TypeReduction typeReduction = new TypeReduction();
        typeReduction.setId(paramTypeReducDto.getId());
        typeReduction.setLibelle(paramTypeReducDto.getLibelle());
        return typeReduction;
    }

    public static TypeRetour typeRetourFromTypeRetourDto(TypeRetourDto paramTypeRetourDto) {
        TypeRetour typeRetour = new TypeRetour();
        typeRetour.setId(paramTypeRetourDto.getId());
        typeRetour.setLibelle(paramTypeRetourDto.getLibelle());
        return typeRetour;
    }

    public static TypeSujet typeSujetFromTypeSujetDto(TypeSujetDto paramTypeSujetDto) {
        TypeSujet typeSujet = new TypeSujet();
        typeSujet.setId(paramTypeSujetDto.getId());
        typeSujet.setLibelle(paramTypeSujetDto.getLibelle());
        return typeSujet;
    }

    public static Utilisateur userFromUserDto(UtilisateurDto paramUserDto) {
        if (paramUserDto.getClass() == ClientDto.class) {
            return clientFromClientDto((ClientDto) paramUserDto);
        } else if (paramUserDto.getClass() == AssociationDto.class) {
            return assoFromAssoDto((AssociationDto) paramUserDto);
        } else if (paramUserDto.getClass() == ModerateurDto.class) {
            return moderateurFromModerateurDto((ModerateurDto) paramUserDto);
        } else if (paramUserDto.getClass() == GerantDto.class) {
            return gerantFromGerantDto((GerantDto) paramUserDto);
        } else if (paramUserDto.getClass() == AdministrateurDto.class) {
            return adminFromAdminDto((AdministrateurDto) paramUserDto);
        } else {
            Utilisateur user = new Utilisateur();
            user.setDateInscription(paramUserDto.getDateInscription());
            if (paramUserDto.getId() != null) {
                user.setId(paramUserDto.getId());
            }
            user.setNom(paramUserDto.getNom());
            user.setPrenom(paramUserDto.getPrenom());
            user.setMail(paramUserDto.getMail());
            user.setPassword(paramUserDto.getPassword());
            user.setTelephone(paramUserDto.getTelephone());
            if (paramUserDto.getCivilite() != null) {
                user.setCivilite(civiliteFromCiviliteDto(paramUserDto.getCivilite()));
            }
            return user;
        }
    }

    public static Ville villeFromVilleDto(VilleDto paramVilleDto) {
        Ville ville = new Ville();
        ville.setCp(paramVilleDto.getCp());
        ville.setId(paramVilleDto.getId());
        ville.setNom(paramVilleDto.getNom());
        return ville;
    }

    public static List<AdresseDto> listAdresseDtoFromListAdresse(List<Adresse> paramList) {
        List<AdresseDto> list = new ArrayList<>();
        for (Adresse entity : paramList) {
            list.add(adresseDtoFromAdresse(entity));
        }
        return list;
    }

    public static List<AlerteDto> listAlerteDtoFromListAlerte(List<Alerte> paramList) {
        List<AlerteDto> list = new ArrayList<>();
        for (Alerte entity : paramList) {
            list.add(alertDtoFromAlert(entity));
        }
        return list;
    }

    public static List<AlerteCommentaireDto> listAlerteComDtoFromListAlerteCom(List<AlerteCommentaire> paramList) {
        List<AlerteCommentaireDto> list = new ArrayList<>();
        for (AlerteCommentaire entity : paramList) {
            list.add(alertComDtoFromAlertCom(entity));
        }
        return list;
    }

    public static List<AlerteMessageDto> listAlerteMsgDtoFromListAlerteMsg(List<AlerteMessage> paramList) {
        List<AlerteMessageDto> list = new ArrayList<>();
        for (AlerteMessage entity : paramList) {
            list.add(alertMsgDtoFromAlertMsg(entity));
        }
        return list;
    }

    public static List<AlerteProduitDto> listAlertePdtDtoFromListAlertePdt(List<AlerteProduit> paramList) {
        List<AlerteProduitDto> list = new ArrayList<>();
        for (AlerteProduit entity : paramList) {
            list.add(alertPdtDtoFromAlertPdt(entity));
        }
        return list;
    }

    public static List<CartePaiementDto> listCBDtoFromListCB(List<CartePaiement> paramList) {
        List<CartePaiementDto> list = new ArrayList<>();
        for (CartePaiement entity : paramList) {
            list.add(cbDtoFromCb(entity));
        }
        return list;
    }

    public static List<CategorieDto> listCategorieDtoFromListCategorie(List<Categorie> paramList) {
        List<CategorieDto> list = new ArrayList<>();
        for (Categorie entity : paramList) {
            list.add(categorieDtoFromCategorie(entity));
        }
        return list;
    }

    public static List<CommandeDto> listCmdDtoFromListCmd(List<Commande> paramList) {
        List<CommandeDto> list = new ArrayList<>();
        for (Commande entity : paramList) {
            list.add(cmdDtoFromCmd(entity));
        }
        return list;
    }

    public static List<DonDto> listDonDtoFromListDon(List<Don> paramList) {
        List<DonDto> list = new ArrayList<>();
        for (Don entity : paramList) {
            list.add(donDtoFromDon(entity));
        }
        return list;
    }

    public static List<EnvieDto> listEnvieDtoFromListEnvie(List<Envie> paramList) {
        List<EnvieDto> list = new ArrayList<>();
        for (Envie entity : paramList) {
            list.add(envieDtoFromEnvie(entity));
        }
        return list;
    }

    public static List<ImageDto> listImageDtoFromListImage(List<Image> paramList) {
        List<ImageDto> list = new ArrayList<>();
        for (Image entity : paramList) {
            list.add(imageDtoFromImage(entity));
        }
        return list;
    }

    public static List<LigneDeCommandeDto> listLigneCmdDtoFromListLigneCmd(List<LigneDeCommande> paramList) {
        List<LigneDeCommandeDto> list = new ArrayList<>();
        for (LigneDeCommande entity : paramList) {
            list.add(ligneCmdDtoFromLigneCmd(entity));
        }
        return list;
    }

    public static List<MethodeLivraisonDto> listMethodeLivraisonDtoFromListMethodeLivraison(List<MethodeLivraison> paramList) {
        List<MethodeLivraisonDto> list = new ArrayList<>();
        for (MethodeLivraison entity : paramList) {
            list.add(methodeLivraisonDtoFromMethodeLivraison(entity));
        }
        return list;
    }

    public static List<MessageForumDto> listMsgForumDtoFromListMsgForum(List<MessageForum> paramList) {
        List<MessageForumDto> list = new ArrayList<>();
        for (MessageForum entity : paramList) {
            list.add(msgForumDtoFromMsgForum(entity));
        }
        return list;
    }

    public static List<MessageInboxDto> listMsgInboxDtoFromListMsgInbox(List<MessageInbox> paramList) {
        List<MessageInboxDto> list = new ArrayList<>();
        for (MessageInbox entity : paramList) {
            list.add(msgInboxDtoFromMsgInbox(entity));
        }
        return list;
    }

    public static List<MessagerieDto> listMessagrieDtoFromListMessagerie(List<Messagerie> paramList) {
        List<MessagerieDto> list = new ArrayList<>();
        for (Messagerie entity : paramList) {
            list.add(messagerieDtoFromMessagerie(entity));
        }
        return list;
    }

    public static List<NoteDto> listNoteDtoFromListNote(List<Note> paramList) {
        List<NoteDto> list = new ArrayList<>();
        for (Note entity : paramList) {
            list.add(noteDtoFromNote(entity));
        }
        return list;
    }

    public static List<NoteClientDto> listNoteClientDtoFromListNoteClient(List<NoteClient> paramList) {
        List<NoteClientDto> list = new ArrayList<>();
        for (NoteClient entity : paramList) {
            list.add(noteClientDtoFromNoteClient(entity));
        }
        return list;
    }

    public static List<NoteProduitDto> listNotePdtDtoFromListNotePdt(List<NoteProduit> paramList) {
        List<NoteProduitDto> list = new ArrayList<>();
        for (NoteProduit entity : paramList) {
            list.add(noteProduitDtoFromNoteProduit(entity));
        }
        return list;
    }

    public static List<ProduitDto> listPdtDtoFromListPdt(List<Produit> paramList) {
        List<ProduitDto> list = new ArrayList<>();
        for (Produit entity : paramList) {
            list.add(produitDtoFromProduit(entity));
        }
        return list;
    }

    public static List<ProduitCodeReductionDto> listPdtCodeReducDtoFromListPdtCodeReduc(List<ProduitCodeReduction> paramList) {
        List<ProduitCodeReductionDto> list = new ArrayList<>();
        for (ProduitCodeReduction entity : paramList) {
            list.add(pdtCodeReducDtoFromPdtCodeReduc(entity));
        }
        return list;
    }

    public static List<RibDto> listRibDtoFromListRib(List<Rib> paramList) {
        List<RibDto> list = new ArrayList<>();
        for (Rib entity : paramList) {
            list.add(ribDtoFromRib(entity));
        }
        return list;
    }

    public static List<RubriqueDto> listRubriqueDtoFromListRubrique(List<Rubrique> paramList) {
        List<RubriqueDto> list = new ArrayList<>();
        for (Rubrique entity : paramList) {
            list.add(rubriqueDtoFromRubrique(entity));
        }
        return list;
    }

    public static List<SujetDto> listSujetDtoFromListSujet(List<Sujet> paramList) {
        List<SujetDto> list = new ArrayList<>();
        for (Sujet entity : paramList) {
            list.add(sujetDtoFromSujet(entity));
        }
        return list;
    }

    public static List<TypeCBDto> listTypeCbDtoFromListTypeCb(List<TypeCB> paramList) {
        List<TypeCBDto> list = new ArrayList<>();
        for (TypeCB entity : paramList) {
            list.add(typeCBDtoFromTypeCB(entity));
        }
        return list;
    }

    public static List<VilleDto> listVilleDtoFromListVille(List<Ville> paramList) {
        List<VilleDto> list = new ArrayList<>();
        for (Ville entity : paramList) {
            list.add(villeDtoFromVille(entity));
        }
        return list;
    }

    public static List<Adresse> listAdresseFromListAdresseDto(List<AdresseDto> paramList) {
        List<Adresse> list = new ArrayList<>();
        for (AdresseDto entity : paramList) {
            list.add(adresseFromAdresseDto(entity));
        }
        return list;
    }

    public static List<Alerte> listAlerteFromListAlerteDto(List<AlerteDto> paramList) {
        List<Alerte> list = new ArrayList<>();
        for (AlerteDto entity : paramList) {
            list.add(alertFromAlertDto(entity));
        }
        return list;
    }

    public static List<AlerteCommentaire> listAlerteComFromListAlerteComDto(List<AlerteCommentaireDto> paramList) {
        List<AlerteCommentaire> list = new ArrayList<>();
        for (AlerteCommentaireDto entity : paramList) {
            list.add(alertComFromAlertComDto(entity));
        }
        return list;
    }

    public static List<AlerteMessage> listAlerteMsgFromListAlerteMsgDto(List<AlerteMessageDto> paramList) {
        List<AlerteMessage> list = new ArrayList<>();
        for (AlerteMessageDto entity : paramList) {
            list.add(alertMsgFromAlertMsgDto(entity));
        }
        return list;
    }

    public static List<AlerteProduit> listAlertePdtFromListAlertePdtDto(List<AlerteProduitDto> paramList) {
        List<AlerteProduit> list = new ArrayList<>();
        for (AlerteProduitDto entity : paramList) {
            list.add(alertPdtFromAlertPdtDto(entity));
        }
        return list;
    }

    public static List<CartePaiement> listCBFromListCBDto(List<CartePaiementDto> paramList) {
        List<CartePaiement> list = new ArrayList<>();
        for (CartePaiementDto entity : paramList) {
            list.add(cbFromCbDto(entity));
        }
        return list;
    }

    public static List<Categorie> listCategorieFromListCategorieDto(List<CategorieDto> paramList) {
        List<Categorie> list = new ArrayList<>();
        for (CategorieDto entity : paramList) {
            list.add(categorieFromCategorieDto(entity));
        }
        return list;
    }

    public static List<Commande> listCmdFromListCmdDto(List<CommandeDto> paramList) {
        List<Commande> list = new ArrayList<>();
        for (CommandeDto entity : paramList) {
            list.add(cmdFromCmdDto(entity));
        }
        return list;
    }

    public static List<Don> listDonFromListDonDto(List<DonDto> paramList) {
        List<Don> list = new ArrayList<>();
        for (DonDto entity : paramList) {
            list.add(donFromDonDto(entity));
        }
        return list;
    }

    public static List<Envie> listEnvieFromListEnvieDto(List<EnvieDto> paramList) {
        List<Envie> list = new ArrayList<>();
        for (EnvieDto entity : paramList) {
            list.add(envieFromEnvieDto(entity));
        }
        return list;
    }

    public static List<Image> listImageFromListImageDto(List<ImageDto> paramList) {
        List<Image> list = new ArrayList<>();
        for (ImageDto entity : paramList) {
            list.add(imageFromImageDto(entity));
        }
        return list;
    }

    public static List<LigneDeCommande> listLigneCmdFromListLigneCmdDto(List<LigneDeCommandeDto> paramList) {
        List<LigneDeCommande> list = new ArrayList<>();
        for (LigneDeCommandeDto entity : paramList) {
            list.add(ligneCmdFromLigneCmdDto(entity));
        }
        return list;
    }

    public static List<MethodeLivraison> listMethodeLivraisonFromListMethodeLivraisonDto(List<MethodeLivraisonDto> paramList) {
        List<MethodeLivraison> list = new ArrayList<>();
        for (MethodeLivraisonDto entity : paramList) {
            list.add(methodeLivraisonFromMethodeLivraisonDto(entity));
        }
        return list;
    }

    public static List<MessageForum> listMsgForumFromListMsgForumDto(List<MessageForumDto> paramList) {
        List<MessageForum> list = new ArrayList<>();
        for (MessageForumDto entity : paramList) {
            list.add(msgForumFromMsgForumDto(entity));
        }
        return list;
    }

    public static List<MessageInbox> listMsgInboxFromListMsgInboxDto(List<MessageInboxDto> paramList) {
        List<MessageInbox> list = new ArrayList<>();
        for (MessageInboxDto entity : paramList) {
            list.add(msgInboxFromMsgInboxDto(entity));
        }
        return list;
    }

    public static List<Messagerie> listMessagrieFromListMessagerieDto(List<MessagerieDto> paramList) {
        List<Messagerie> list = new ArrayList<>();
        for (MessagerieDto entity : paramList) {
            list.add(messagerieFromMessagerieDto(entity));
        }
        return list;
    }

    public static List<Note> listNoteFromListNoteDto(List<NoteDto> paramList) {
        List<Note> list = new ArrayList<>();
        for (NoteDto entity : paramList) {
            list.add(noteFromNoteDto(entity));
        }
        return list;
    }

    public static List<NoteClient> listNoteClientFromListNoteClientDto(List<NoteClientDto> paramList) {
        List<NoteClient> list = new ArrayList<>();
        for (NoteClientDto entity : paramList) {
            list.add(noteClientFromNoteClientDto(entity));
        }
        return list;
    }

    public static List<NoteProduit> listNotePdtFromListNotePdtDto(List<NoteProduitDto> paramList) {
        List<NoteProduit> list = new ArrayList<>();
        for (NoteProduitDto entity : paramList) {
            list.add(noteProduitFromNoteProduitDto(entity));
        }
        return list;
    }

    public static List<Produit> listPdtFromListPdtDto(List<ProduitDto> paramList) {
        List<Produit> list = new ArrayList<>();
        for (ProduitDto entity : paramList) {
            list.add(produitFromProduitDto(entity));
        }
        return list;
    }

    public static List<ProduitCodeReduction> listPdtCodeReducFromListPdtCodeReducDto(List<ProduitCodeReductionDto> paramList) {
        List<ProduitCodeReduction> list = new ArrayList<>();
        for (ProduitCodeReductionDto entity : paramList) {
            list.add(pdtCodeReducFromPdtCodeReducDto(entity));
        }
        return list;
    }

    public static List<Rib> listRibFromListRibDto(List<RibDto> paramList) {
        List<Rib> list = new ArrayList<>();
        for (RibDto entity : paramList) {
            list.add(ribFromRibDto(entity));
        }
        return list;
    }

    public static List<Rubrique> listRubriqueFromListRubriqueDto(List<RubriqueDto> paramList) {
        List<Rubrique> list = new ArrayList<>();
        for (RubriqueDto entity : paramList) {
            list.add(rubriqueFromRubriqueDto(entity));
        }
        return list;
    }

    public static List<Sujet> listSujetFromListSujetDto(List<SujetDto> paramList) {
        List<Sujet> list = new ArrayList<>();
        for (SujetDto entity : paramList) {
            list.add(sujetFromSujetDto(entity));
        }
        return list;
    }

    public static List<TypeCB> listTypeCbFromListTypeCbDto(List<TypeCBDto> paramList) {
        List<TypeCB> list = new ArrayList<>();
        for (TypeCBDto entity : paramList) {
            list.add(typeCBFromTypeCBDto(entity));
        }
        return list;
    }

    public static List<Ville> listVilleFromListVilleDto(List<VilleDto> paramList) {
        List<Ville> list = new ArrayList<>();
        for (VilleDto entity : paramList) {
            list.add(villeFromVilleDto(entity));
        }
        return list;
    }
}
