package sas.edu.hello_spring.form;
 /*@author Alona Sviridova
        *@version 1.1
        *DATE11.08.2020
        *PROJECT NAME hello_spring
        * */

import java.util.Objects;

public class CafedraForm {

 private String id;
 private String name;
 private String desc;
 private String chief;

 public CafedraForm(){

 }

 public CafedraForm(String name, String desc, String chief) {
  this.name = name;
  this.desc = desc;
  this.chief = chief;
 }

 public CafedraForm(String id, String name, String desc, String chief) {
  this.id = id;
  this.name = name;
  this.desc = desc;
  this.chief = chief;
 }

 public void setId(String id) {
  this.id = id;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setDesc(String desc) {
  this.desc = desc;
 }

 public void setChief(String chief) {
  this.chief = chief;
 }

 public String getId() {
  return id;
 }

 public String getName() {
  return name;
 }

 public String getDesc() {
  return desc;
 }

 public String getChief() {
  return chief;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  CafedraForm that = (CafedraForm) o;
  return Objects.equals(id, that.id) &&
          Objects.equals(name, that.name) &&
          Objects.equals(desc, that.desc) &&
          Objects.equals(chief, that.chief);
 }

 @Override
 public int hashCode() {
  return Objects.hash(id, name, desc, chief);
 }

 @Override
 public String toString() {
  return "CafedraForm{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          ", desc='" + desc + '\'' +
          ", chief='" + chief + '\'' +
          '}';
 }
}
