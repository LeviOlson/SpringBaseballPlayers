/**  
* @author Levi Olson - lolson17  
* CIS175 - Spring 2021  
* Mar 25, 2021  
*/

package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
}
