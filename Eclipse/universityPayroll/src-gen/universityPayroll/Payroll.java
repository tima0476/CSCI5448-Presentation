/**
 */
package universityPayroll;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payroll</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universityPayroll.UniversityPayrollPackage#getPayroll()
 * @model
 * @generated
 */
public interface Payroll extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LoadFromDatabase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void GeneratePaychecks();

} // Payroll
