//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-07/07/2014 12:56 PM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.24 at 03:29:40 PM EDT 
//

package org.titou10.jtb.script.gen;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for directory complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="directory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="script" type="{}script" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directory" type="{}directory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directory", propOrder = { "script", "directory" })
public class Directory {

   protected List<Script>    script;
   protected List<Directory> directory;
   @XmlAttribute(name = "name")
   protected String          name;

   @XmlTransient
   protected Directory parent;

   public Directory getParent() {
      return parent;
   }

   public void setParent(Directory parent) {
      this.parent = parent;
   }

   /**
    * Gets the value of the script property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned
    * list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the script property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getScript().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list {@link Script }
    * 
    * 
    */
   public List<Script> getScript() {
      if (script == null) {
         script = new ArrayList<Script>();
      }
      return this.script;
   }

   /**
    * Gets the value of the directory property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned
    * list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the directory property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getDirectory().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list {@link Directory }
    * 
    * 
    */
   public List<Directory> getDirectory() {
      if (directory == null) {
         directory = new ArrayList<Directory>();
      }
      return this.directory;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getName() {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setName(String value) {
      this.name = value;
   }

}