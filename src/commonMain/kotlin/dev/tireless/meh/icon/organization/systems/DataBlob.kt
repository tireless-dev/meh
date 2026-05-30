// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataBlob: ImageVector
  get() {
    val current = _dataBlob
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataBlob",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 4 v24 h24 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
        }
        // <rect width="2" height="7" x="13.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 7
          moveTo(x = 13.0f, y = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="7" x="8.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 7
          moveTo(x = 8.0f, y = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M22 14 h-2 a2 2 0 0 1 -2 -2 V9 a2 2 0 0 1 2 -2 h2 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 m-2 -5 v3 h2 V9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 14
          moveTo(x = 22.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m -2 -5
          moveToRelative(dx = -2.0f, dy = -5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
        }
        // <rect width="2" height="7" x="22.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 18
          moveTo(x = 22.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="7" x="8.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M17 25 h-2 a2 2 0 0 1 -2 -2 v-3 a2 2 0 0 1 2 -2 h2 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 m-2 -5 v3 h2 v-3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 25
          moveTo(x = 17.0f, y = 25.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m -2 -5
          moveToRelative(dx = -2.0f, dy = -5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _dataBlob = it }
  }

@Suppress("ObjectPropertyName")
private var _dataBlob: ImageVector? = null
