// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Certificate: ImageVector
  get() {
    val current = _certificate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Certificate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 17.0 25.912 20.703 30.0 21.297 27.0 24.0 27.771 28.0 24.0 25.75 20.229 28.0 21.0 24.0 18.0 21.297 22.2 20.703 24.0 17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 17
          moveTo(x = 24.0f, y = 17.0f)
          // L 25.912 20.703
          lineTo(x = 25.912f, y = 20.703f)
          // L 30 21.297
          lineTo(x = 30.0f, y = 21.297f)
          // L 27 24
          lineTo(x = 27.0f, y = 24.0f)
          // L 27.771 28
          lineTo(x = 27.771f, y = 28.0f)
          // L 24 25.75
          lineTo(x = 24.0f, y = 25.75f)
          // L 20.229 28
          lineTo(x = 20.229f, y = 28.0f)
          // L 21 24
          lineTo(x = 21.0f, y = 24.0f)
          // L 18 21.297
          lineTo(x = 18.0f, y = 21.297f)
          // L 22.2 20.703
          lineTo(x = 22.2f, y = 20.703f)
          // L 24 17z
          lineTo(x = 24.0f, y = 17.0f)
          close()
        }
        // <rect width="6" height="2" x="6.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 16
          moveTo(x = 6.0f, y = 16.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="10" height="2" x="6.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="6.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // M16 26 H4 V6 h24 v10 h2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
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
      .also { _certificate = it }
  }

@Suppress("ObjectPropertyName")
private var _certificate: ImageVector? = null
