/**
 */
package universityPayroll;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see universityPayroll.UniversityPayrollFactory
 * @model kind="package"
 * @generated
 */
public interface UniversityPayrollPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "universityPayroll";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/universityPayroll";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "universityPayroll";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityPayrollPackage eINSTANCE = universityPayroll.impl.UniversityPayrollPackageImpl.init();

	/**
	 * The meta object id for the '{@link universityPayroll.impl.PayrollImpl <em>Payroll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universityPayroll.impl.PayrollImpl
	 * @see universityPayroll.impl.UniversityPayrollPackageImpl#getPayroll()
	 * @generated
	 */
	int PAYROLL = 0;

	/**
	 * The number of structural features of the '<em>Payroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load From Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL___LOAD_FROM_DATABASE = 0;

	/**
	 * The operation id for the '<em>Generate Paychecks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL___GENERATE_PAYCHECKS = 1;

	/**
	 * The number of operations of the '<em>Payroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYROLL_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link universityPayroll.Payroll <em>Payroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payroll</em>'.
	 * @see universityPayroll.Payroll
	 * @generated
	 */
	EClass getPayroll();

	/**
	 * Returns the meta object for the '{@link universityPayroll.Payroll#LoadFromDatabase() <em>Load From Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load From Database</em>' operation.
	 * @see universityPayroll.Payroll#LoadFromDatabase()
	 * @generated
	 */
	EOperation getPayroll__LoadFromDatabase();

	/**
	 * Returns the meta object for the '{@link universityPayroll.Payroll#GeneratePaychecks() <em>Generate Paychecks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Paychecks</em>' operation.
	 * @see universityPayroll.Payroll#GeneratePaychecks()
	 * @generated
	 */
	EOperation getPayroll__GeneratePaychecks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversityPayrollFactory getUniversityPayrollFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universityPayroll.impl.PayrollImpl <em>Payroll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universityPayroll.impl.PayrollImpl
		 * @see universityPayroll.impl.UniversityPayrollPackageImpl#getPayroll()
		 * @generated
		 */
		EClass PAYROLL = eINSTANCE.getPayroll();

		/**
		 * The meta object literal for the '<em><b>Load From Database</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYROLL___LOAD_FROM_DATABASE = eINSTANCE.getPayroll__LoadFromDatabase();

		/**
		 * The meta object literal for the '<em><b>Generate Paychecks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYROLL___GENERATE_PAYCHECKS = eINSTANCE.getPayroll__GeneratePaychecks();

	}

} //UniversityPayrollPackage
