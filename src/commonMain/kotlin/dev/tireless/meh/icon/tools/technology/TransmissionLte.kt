// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TransmissionLte: ImageVector
  get() {
    val current = _transmissionLte
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TransmissionLte",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m10.57 30 .93 -2 h9 l.93 2 h2.2 L17 15.78 V11 h-2 v4.78 L8.36 30Z M16 18.36 17.7 22 h-3.4Z M13.37 24 h5.26 l.93 2 h-7.12Z M10.78 9.33 a7 7 0 0 1 10.44 0 l-1.5 1.34 a5 5 0 0 0 -7.45 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.57 30
          moveTo(x = 10.57f, y = 30.0f)
          // l 0.93 -2
          lineToRelative(dx = 0.93f, dy = -2.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // l 0.93 2
          lineToRelative(dx = 0.93f, dy = 2.0f)
          // h 2.2
          horizontalLineToRelative(dx = 2.2f)
          // L 17 15.78
          lineTo(x = 17.0f, y = 15.78f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4.78
          verticalLineToRelative(dy = 4.78f)
          // L 8.36 30z
          lineTo(x = 8.36f, y = 30.0f)
          close()
          // M 16 18.36
          moveTo(x = 16.0f, y = 18.36f)
          // L 17.7 22
          lineTo(x = 17.7f, y = 22.0f)
          // h -3.4z
          horizontalLineToRelative(dx = -3.4f)
          close()
          // M 13.37 24
          moveTo(x = 13.37f, y = 24.0f)
          // h 5.26
          horizontalLineToRelative(dx = 5.26f)
          // l 0.93 2
          lineToRelative(dx = 0.93f, dy = 2.0f)
          // h -7.12z
          horizontalLineToRelative(dx = -7.12f)
          close()
          // M 10.78 9.33
          moveTo(x = 10.78f, y = 9.33f)
          // a 7 7 0 0 1 10.44 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 10.44f,
            dy1 = 0.0f,
          )
          // l -1.5 1.34
          lineToRelative(dx = -1.5f, dy = 1.34f)
          // a 5 5 0 0 0 -7.45 0z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.45f,
            dy1 = 0.0f,
          )
          close()
        }
        // M7.2 6.4 a11 11 0 0 1 17.6 0 l-1.6 1.2 a9 9 0 0 0 -14.4 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.2 6.4
          moveTo(x = 7.2f, y = 6.4f)
          // a 11 11 0 0 1 17.6 0
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.6f,
            dy1 = 0.0f,
          )
          // l -1.6 1.2
          lineToRelative(dx = -1.6f, dy = 1.2f)
          // a 9 9 0 0 0 -14.4 0z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -14.4f,
            dy1 = 0.0f,
          )
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
      .also { _transmissionLte = it }
  }

@Suppress("ObjectPropertyName")
private var _transmissionLte: ImageVector? = null
