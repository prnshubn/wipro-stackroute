# Create Password Validator Component

Secure Tech Limited is a New York based IT solutions provider. They excel in providing software solutions in various domains ranging from banking, insurance to e-commerce. Securing the users&#39; data is one of the most essential and standard requirements among all types of products. Users of these products are required to authenticate their identities before accessing the application. To authenticate, the user is expected to provide login credentials. The password must be strong, and the strength is a combination of length and characters used. Since this is a common requirement, the firm wants its frontend developers to develop a reusable component that takes a password as input and validates it based on the length criteria specifications. Additionally, the component is expected to take the error message to be displayed as input. So, as a Frontend Developer, you are expected to carry out the task of building a PasswordValidator component and testing locally.

**Why develop a Password Validator?**

Passwords are an integral part of our lives today. Passwords provide the first line of defense against unauthorized access to our devices and personal information. The stronger the password, the more protected our data will be from hackers and malicious software. Hence, developing a strong PasswordValidator is essential.

# Facts

- 90% of passwords can be cracked in less than six hours
- 59% of people use the same password everywhere
- Only 7 out of 10 people trust passwords to protect their online accounts
- 86% of people who use Two Factor Authentication (2FA) feel their accounts are more secure

# Challenge

As a Frontend Developer, you are assigned to develop a component that validates the password that is inputted. It should validate the inputted password based on specified values. The values should be modifiable as per the client&#39;s requirements.

The PasswordValidator should have the option to input the preferred values for:

- Minimum length: The minimum number of characters the password should contain
- Maximum length: The maximum number of characters the password should contain
- Error Message: The message for empty or invalid passwords

Below is a set of sample inputs followed by a table of common scenarios for a better understanding.

**Preferred inputs:**

- Minimum length: 8 characters
- Maximum length: 20 characters

| **Input** | **Scenario** | **Error Message** |
| --- | --- | --- |
| Hello2UAll | Password length is greater than the specified length. | |
| Hello2U | Password length is less than the specified minimum length. | Password does not match the specified criteria |
| Hello2UAllHello2UAllHello | Password length is greater than the specified length. | Password does not match the specified criteria | |
 | Password is deleted after typing or left blank. | Password is mandatory and cannot be left bank |

Once the component is developed, test it locally within the same Angular workspace.

## Instructions

- Create Angular Application
- Add library project
- Add Module
- Add Component (eg. Password Validator)
    - Should have one input-bound property (Password)
    - Should have one output-bound property (validation-status (string))
- Build the library project
- Test it locally in the existing angular application inside same workspace
