// from the file 'Messenger.groovy'
package com.spring.tutorial.postprocessors.beanpostprocessor.groovy;

// import the Messenger interface (written in Java) that is to be implemented
import com.spring.tutorial.postprocessors.beanpostprocessor.messages.Messenger

// define the implementation in Groovy
class GroovyMessenger implements Messenger {

    String message
}