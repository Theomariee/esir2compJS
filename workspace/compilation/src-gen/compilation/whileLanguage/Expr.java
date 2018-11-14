/**
 * generated by Xtext 2.15.0
 */
package compilation.whileLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilation.whileLanguage.Expr#getExprsimple <em>Exprsimple</em>}</li>
 * </ul>
 *
 * @see compilation.whileLanguage.WhileLanguagePackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exprsimple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprsimple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprsimple</em>' containment reference.
   * @see #setExprsimple(ExprSimple)
   * @see compilation.whileLanguage.WhileLanguagePackage#getExpr_Exprsimple()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprsimple();

  /**
   * Sets the value of the '{@link compilation.whileLanguage.Expr#getExprsimple <em>Exprsimple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprsimple</em>' containment reference.
   * @see #getExprsimple()
   * @generated
   */
  void setExprsimple(ExprSimple value);

} // Expr