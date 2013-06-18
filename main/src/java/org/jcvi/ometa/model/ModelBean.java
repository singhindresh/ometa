/*
 * Copyright J. Craig Venter Institute, 2013
 *
 * The creation of this program was supported by J. Craig Venter Institute
 * and National Institute for Allergy and Infectious Diseases (NIAID),
 * Contract number HHSN272200900007C.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jcvi.ometa.model;
import java.util.Date;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: lfoster
 * Date: Oct 26, 2010
 * Time: 6:21:56 PM
 *
 * Interface to identify something as being part of the model.  Contracts all "tracking" information.
 */
public interface ModelBean extends Serializable {
    // Set this field for future compatibility.  Override as needed.
    static final long serialVersionUID = 1L;

    Long getCreatedBy();
    void setCreatedBy(Long modifiedBy);

    Long getModifiedBy();
    void setModifiedBy(Long modifiedBy);

    Date getCreationDate();
    void setCreationDate(Date creationDate);

    Date getModifiedDate();
    void setModifiedDate(Date modifiedDate);

}
