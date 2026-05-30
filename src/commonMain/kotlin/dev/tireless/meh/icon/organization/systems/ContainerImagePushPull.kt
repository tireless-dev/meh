// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerImagePushPull: ImageVector
  get() {
    val current = _containerImagePushPull
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContainerImagePushPull",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 23 H20 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 M20 11 v10 h10 V11z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23
          moveTo(x = 30.0f, y = 23.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // M 20 11
          moveTo(x = 20.0f, y = 11.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 11z
          verticalLineTo(y = 11.0f)
          close()
        }
        // <polygon points="9.0 5.0 14.0 10.0 9.0 15.0 7.581 13.591 10.153 11.0 0.0 11.0 0.0 9.0 10.206 9.0 7.581 6.409 9.0 5.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 9 5
          moveTo(x = 9.0f, y = 5.0f)
          // L 14 10
          lineTo(x = 14.0f, y = 10.0f)
          // L 9 15
          lineTo(x = 9.0f, y = 15.0f)
          // L 7.581 13.591
          lineTo(x = 7.581f, y = 13.591f)
          // L 10.153 11
          lineTo(x = 10.153f, y = 11.0f)
          // L 0 11
          lineTo(x = 0.0f, y = 11.0f)
          // L 0 9
          lineTo(x = 0.0f, y = 9.0f)
          // L 10.206 9
          lineTo(x = 10.206f, y = 9.0f)
          // L 7.581 6.409
          lineTo(x = 7.581f, y = 6.409f)
          // L 9 5z
          lineTo(x = 9.0f, y = 5.0f)
          close()
        }
        // <polygon points="5.0 27.0 0.0 22.0 5.0 17.0 6.419 18.409 3.847 21.0 14.0 21.0 14.0 23.0 3.794 23.0 6.419 25.591 5.0 27.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 5 27
          moveTo(x = 5.0f, y = 27.0f)
          // L 0 22
          lineTo(x = 0.0f, y = 22.0f)
          // L 5 17
          lineTo(x = 5.0f, y = 17.0f)
          // L 6.419 18.409
          lineTo(x = 6.419f, y = 18.409f)
          // L 3.847 21
          lineTo(x = 3.847f, y = 21.0f)
          // L 14 21
          lineTo(x = 14.0f, y = 21.0f)
          // L 14 23
          lineTo(x = 14.0f, y = 23.0f)
          // L 3.794 23
          lineTo(x = 3.794f, y = 23.0f)
          // L 6.419 25.591
          lineTo(x = 6.419f, y = 25.591f)
          // L 5 27z
          lineTo(x = 5.0f, y = 27.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _containerImagePushPull = it }
  }

@Suppress("ObjectPropertyName")
private var _containerImagePushPull: ImageVector? = null
