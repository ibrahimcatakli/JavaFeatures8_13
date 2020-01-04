package com.java.v8;

import java.util.Optional;

public class _05_OptionalClass {
	
	public static <X> void main(String[] args) {
		
		_05_User user = null;
		// of	
		_05_OptionalInterface op = (object) -> {try { System.out.println(Optional.of(object));  } catch (Exception e) {
			System.err.println(e);
		} };
		op.optional(user);
		
		// ofNullable
		op = (object) -> {try { System.out.println( Optional.ofNullable(object));  } catch (Exception e) {
			System.err.println(e.getMessage());
		} };
		op.optional(user); 
		
		// isPresent	
		op = (object) -> {try { System.out.println(Optional.ofNullable(object).isPresent());  } catch (Exception e) {
			System.err.println(e.getMessage());
		} };
		op.optional(user); 
		
		// orElseGet	
		op = (object) -> {try { System.out.println(Optional.ofNullable(Optional.ofNullable(object).orElseGet(_05_User::new)));  } catch (Exception e) {
			System.err.println(e.getMessage());
		} };
		op.optional(user); 
		
		// orElseThrow	
		op = (object) -> {try { System.out.println(Optional.ofNullable(object).orElseThrow(NullPointerException::new));  } catch (Exception e) {
			System.err.println(e);
		} };
		op.optional(user); 
		
	}

}
