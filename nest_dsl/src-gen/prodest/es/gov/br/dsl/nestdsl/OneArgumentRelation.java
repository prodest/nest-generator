/**
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.nestdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Argument Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation#getArgument <em>Argument</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getOneArgumentRelation()
 * @model
 * @generated
 */
public interface OneArgumentRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute.
   * @see #setArgument(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getOneArgumentRelation_Argument()
   * @model
   * @generated
   */
  String getArgument();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation#getArgument <em>Argument</em>}' attribute.
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
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getOneArgumentRelation_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.OneArgumentRelation#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

} // OneArgumentRelation
