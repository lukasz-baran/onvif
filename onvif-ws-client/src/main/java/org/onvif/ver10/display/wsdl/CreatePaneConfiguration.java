
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PaneConfiguration;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoOutput" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="PaneConfiguration" type="{http://www.onvif.org/ver10/schema}PaneConfiguration"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "videoOutput",
    "paneConfiguration",
    "any"
})
@XmlRootElement(name = "CreatePaneConfiguration")
public class CreatePaneConfiguration {

    @XmlElement(name = "VideoOutput", required = true)
    protected String videoOutput;
    @XmlElement(name = "PaneConfiguration", required = true)
    protected PaneConfiguration paneConfiguration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Recupera il valore della proprietà videoOutput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutput() {
        return videoOutput;
    }

    /**
     * Imposta il valore della proprietà videoOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutput(String value) {
        this.videoOutput = value;
    }

    /**
     * Recupera il valore della proprietà paneConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link PaneConfiguration }
     *     
     */
    public PaneConfiguration getPaneConfiguration() {
        return paneConfiguration;
    }

    /**
     * Imposta il valore della proprietà paneConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link PaneConfiguration }
     *     
     */
    public void setPaneConfiguration(PaneConfiguration value) {
        this.paneConfiguration = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
