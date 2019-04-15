/**
 */
package universityPayroll.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universityPayroll.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityPayrollFactoryImpl extends EFactoryImpl implements UniversityPayrollFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversityPayrollFactory init() {
		try {
			UniversityPayrollFactory theUniversityPayrollFactory = (UniversityPayrollFactory) EPackage.Registry.INSTANCE
					.getEFactory(UniversityPayrollPackage.eNS_URI);
			if (theUniversityPayrollFactory != null) {
				return theUniversityPayrollFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversityPayrollFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityPayrollFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UniversityPayrollPackage.PAYROLL:
			return createPayroll();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payroll createPayroll() {
		PayrollImpl payroll = new PayrollImpl();
		return payroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversityPayrollPackage getUniversityPayrollPackage() {
		return (UniversityPayrollPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversityPayrollPackage getPackage() {
		return UniversityPayrollPackage.eINSTANCE;
	}

} //UniversityPayrollFactoryImpl
