/**
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.nestdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getName <em>Name</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getType <em>Type</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getDtoProperty()
 * @model
 * @generated
 */
public interface DtoProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getDtoProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DtoType)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getDtoProperty_Type()
   * @model
   * @generated
   */
  DtoType getType();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DtoType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getDtoProperty_Array()
   * @model
   * @generated
   */
  String getArray();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.DtoProperty#getArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #getArray()
   * @generated
   */
  void setArray(String value);

} // DtoProperty