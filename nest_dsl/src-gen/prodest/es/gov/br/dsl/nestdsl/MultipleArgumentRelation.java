/**
 * generated by XText 2.19.0
 */
package prodest.es.gov.br.dsl.nestdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Argument Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getArgument <em>Argument</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getType <em>Type</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getSecondArgument <em>Second Argument</em>}</li>
 * </ul>
 *
 * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getMultipleArgumentRelation()
 * @model
 * @generated
 */
public interface MultipleArgumentRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute.
   * @see #setArgument(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getMultipleArgumentRelation_Argument()
   * @model
   * @generated
   */
  String getArgument();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getArgument <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' attribute.
   * @see #getArgument()
   * @generated
   */
  void setArgument(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getMultipleArgumentRelation_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Second Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Argument</em>' attribute.
   * @see #setSecondArgument(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getMultipleArgumentRelation_SecondArgument()
   * @model
   * @generated
   */
  String getSecondArgument();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.MultipleArgumentRelation#getSecondArgument <em>Second Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Argument</em>' attribute.
   * @see #getSecondArgument()
   * @generated
   */
  void setSecondArgument(String value);

} // MultipleArgumentRelation
