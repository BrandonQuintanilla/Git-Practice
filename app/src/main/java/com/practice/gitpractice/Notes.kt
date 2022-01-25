package com.practice.gitpractice

/**
 * Deleting branches
 * De acuerdo a las estragias de construccion usadas, pueden quedar branches en desuso
 *
 * git branch -d branch-name-todelete -> Asegurarse de que HEAD apunte a un branch que no sea el que vamos a eliminar
 *                                       No se puede eliminar el branch donde apunta el HEAD
 * En caso deseemos eliminar un branch local el cual no se haya hecho merge con otro, es un branch en el cual existe informacion unica,
 * en ese caso Git lanzará un error. Si estamos complemtane seguros, usar el parametro "-f" to force it.
 * Cuando se inicia un house cleaning, tener en cuenta si se eliminar un branch local, quizas tambien querramos eliminar el correspondiente branch remoto
 * */

/**
 * Merging branches, the most common way to integrate changes
 * Lo que hago es traer commits de un branch a mi current HEAD branch
 *
 *
 * git switch receiver-branch -> apuntar el HEAD hacia donde queremos se dirijan los cambios
 * git merge source-branch -> definimos el branch fuente de cambios que se integrara  al HEAD actual
 *
 * Un merge comunmente crea un merge commit, cuyo mensaje tiene un standard dado por el mismo git editor
 *
 * No es recomendable realizar un rebase en repositorios de trabajo en grupos
 *
 * */


/**
 * Comparing branches
 * Util para comparar antes de realizar un merge o de eliminar un branch
 *
 * git log first_branch..second_branch -> indica que cambios se encuentran en el second_branch pero no en el first_branch
 *
 *
 *
 * **/